package com.digitalBooking.DigitalBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.time.Clock;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.digitalBooking.DigitalBooking.security"})
public class DigitalBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalBookingApplication.class, args);

}

	@Bean
	public Clock clock(){
		return Clock.systemDefaultZone();
	}


}
