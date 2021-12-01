package com.example.demoupload.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany
    private List<FileDB> ListFATCA;
    @OneToMany
    private List<FileDB> listTTBB;
}
