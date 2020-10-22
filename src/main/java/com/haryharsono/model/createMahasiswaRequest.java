package com.haryharsono.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class createMahasiswaRequest {

    @NotNull
    private String id;
    @NotNull
    @Size(min = 1, max = 7)
    private String stambuk;
    @NotBlank
    private String name;
    @Min(1)
    @NotNull
    private int umur;
    @NotBlank
    private String jurusan;
    @NotBlank
    private String agama;
    @NotBlank
    private String jenisKelamin;

}
