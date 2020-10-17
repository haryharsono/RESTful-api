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
    @Min(1)
    private String name;
    @Min(7)
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
    private Date updateAt;


}
