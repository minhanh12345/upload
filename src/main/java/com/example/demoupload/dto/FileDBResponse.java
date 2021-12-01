package com.example.demoupload.dto;

import lombok.Data;

@Data
public class FileDBResponse {
    private String name;
    private String url1;
    private String url2;
    private String type;
    private long size;

    public FileDBResponse(String name, String url1, String url2, String type, long size) {
        this.name = name;
        this.url1 = url1;
        this.url2 = url2;
        this.type = type;
        this.size = size;
    }
}
