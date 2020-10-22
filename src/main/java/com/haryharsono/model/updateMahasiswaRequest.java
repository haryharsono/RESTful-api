package com.haryharsono.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Getter
@Setter
public class updateMahasiswaRequest {

    @Pattern(regexp = "|.{1,7}")
    private String stambuk;
    @NotBlank
    private String name;
    @Min(1)
    private int umur;
    @NotBlank
    private String jurusan;
    @NotBlank
    private String agama;
    @NotBlank
    private String jenisKelamin;
    private Date updateAt;


}
