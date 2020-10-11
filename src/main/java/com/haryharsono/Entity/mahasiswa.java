package com.haryharsono.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class mahasiswa {

    @Id
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
