package com.example.demoupload.model;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "fileDB")
public class FileDB {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name1;
    private String name2;

    private String type1;
    private String type2;

    @Lob
    private byte[] data1;

    @Lob
    private byte[] data2;

    public FileDB(String name1, String name2, String type1, String type2, byte[] data1, byte[] data2) {
        this.name1 = name1;
        this.name2 = name2;
        this.type1 = type1;
        this.type2 = type2;
        this.data1 = data1;
        this.data2 = data2;

    }

    public FileDB() {

    }


}
