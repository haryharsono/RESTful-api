package com.haryharsono.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.Date;

@Getter
@Setter
public class createMahasiswaRequest {

    @NotBlank
    private String id;
    @NotBlank
    @Min(1)
    @Max(255)
    private String stambuk;
    @Min(1)
    @Max(255)
    @NotBlank
    private String name;
    @Min(15)
    @NotNull
    private int umur;
    @Min(1)
    @Max(255)
    @NotBlank
    private String jurusan;
    @Min(1)
    @Max(255)
    @NotBlank
    private String agama;
    @Min(1)
    @Max(255)
    @NotBlank
    private String jenisKelamin;

}
