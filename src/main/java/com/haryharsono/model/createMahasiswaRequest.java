package com.haryharsono.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class createMahasiswaRequest {

    private String id;
    private String stambuk;
    private String name;
    private int umur;
    private String jurusan;
    private String agama;
    private String jenisKelamin;

}
