package com.example.demoupload.service;

import com.example.demoupload.model.FileDB;
import com.example.demoupload.repository.FileDBRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
@Service
public class FileDBServiceImpl implements FileDBService{
    @Autowired
    private FileDBRepository fileDBRepository;

    @Override
    public FileDB store(MultipartFile file1,MultipartFile file2) throws IOException {
        String fileName1 = StringUtils.cleanPath(file1.getOriginalFilename());
        String fileName2 = StringUtils.cleanPath(file2.getOriginalFilename());
        FileDB image = new FileDB(fileName1,fileName2, file1.getContentType(),file2.getContentType(), file1.getBytes(), file2.getBytes());

        return fileDBRepository.save(image);
    }

    @Override
    public Stream<FileDB> getAllFiles() {
        return fileDBRepository.findAll().stream();
    }
}
