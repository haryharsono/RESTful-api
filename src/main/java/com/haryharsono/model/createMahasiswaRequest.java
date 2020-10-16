package com.haryharsono.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
public class createMahasiswaRequest {

    @NotBlank
    private String id;
    @NotBlank
    @Pattern(regexp = "|.{1,7}")
    private String stambuk;
    @Min(1)
    @NotBlank
    private String name;
    @Min(15)
    @NotNull
    private int umur;
    @Min(1)
    @NotBlank
    private String jurusan;
    @Min(1)
    @NotBlank
    private String agama;
    @Min(1)
    @NotBlank
    private String jenisKelamin;

}
