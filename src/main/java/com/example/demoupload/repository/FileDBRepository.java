package com.example.demoupload.repository;

import com.example.demoupload.model.FileDB;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileDBRepository extends JpaRepository<FileDB,Long> {
}
