package com.digitalBooking.DigitalBooking.service.api;

import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.List;

public  interface AWSS3Service {

    void uploadFile(MultipartFile file);

    List<String> getObjectsFromS3();

    InputStream downloadFile(String key);
}