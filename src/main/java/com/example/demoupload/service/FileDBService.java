package com.example.demoupload.service;

import com.example.demoupload.model.FileDB;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.stream.Stream;

public interface FileDBService {
    FileDB store(MultipartFile file) throws IOException;

    Stream<FileDB> getAllFiles();
}
