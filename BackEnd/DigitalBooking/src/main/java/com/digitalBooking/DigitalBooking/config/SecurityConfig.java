package com.digitalBooking.DigitalBooking.config;
import com.digitalBooking.DigitalBooking.security.jwt.JwtRequestFilter;
import jakarta.servlet.Filter;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.util.List;

import static com.digitalBooking.DigitalBooking.model.Role.ADMIN;
import static com.digitalBooking.DigitalBooking.model.Role.USER;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    JwtRequestFilter jwtAuthenticationFilter;


    @Bean
    public SecurityFilterChain securityFilterChain (HttpSecurity httpSecurity) throws  Exception{

        return httpSecurity
                .cors(Customizer.withDefaults())
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(authorizeHttpRequestsCustomizer -> authorizeHttpRequestsCustomizer
                        .requestMatchers(HttpMethod.POST, "/auth/**").permitAll()
                        .requestMatchers(HttpMethod.POST, "/auth/signup").permitAll()
                        .requestMatchers(HttpMethod.POST,"/instruments/add").hasAuthority(ADMIN.name())
                        .requestMatchers(HttpMethod.GET,"/instruments/{id}").permitAll()
                        .requestMatchers(HttpMethod.GET,"/instruments/showAll").anonymous()
                        .requestMatchers(HttpMethod.DELETE,"/instruments/{id}").hasAuthority(ADMIN.name())
                        .requestMatchers(HttpMethod.GET,"/admin/categories/showAll").permitAll()
                        .requestMatchers(HttpMethod.POST,"/admin/categories/add").hasAuthority(ADMIN.name())
                        .requestMatchers(HttpMethod.GET, "/admin/categories/{id}").permitAll()
                        .requestMatchers(HttpMethod.DELETE,"/admin/categories/{id}").hasAuthority(ADMIN.name()).anyRequest().authenticated())
                        .addFilterBefore(jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class).sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();


    }




    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(List.of("http://localhost:8080"));
        configuration.setAllowedHeaders(List.of("*"));
        configuration.setAllowedMethods(List.of("*"));
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }
}


