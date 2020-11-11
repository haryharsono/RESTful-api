package com.haryharsono.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class listMahasiswaRequest {

    private int page;
    private int size;

}
