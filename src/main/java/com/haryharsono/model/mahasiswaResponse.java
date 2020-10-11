package com.haryharsono.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class mahasiswaResponse {


    private String id;
    private String stambuk;
    private String name;
    private int umur;
    private String jurusan;
    private String agama;
    private String jenisKelamin;
    private Date createdAt;
    private Date updateAt;

}
