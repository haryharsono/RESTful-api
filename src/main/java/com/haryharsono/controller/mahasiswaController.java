package com.haryharsono.controller;

import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import com.haryharsono.model.webResponse;
import com.haryharsono.service.mahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mahasiswaController {

    @Autowired
    mahasiswaService mahasiswaService;

    @PostMapping(
            value = "/api/mahasiswa",
            produces = "application/json",
            consumes = "application/json")
    private webResponse<mahasiswaResponse> createMahasiswa(@RequestBody createMahasiswaRequest createMahasiswaRequest){
        mahasiswaResponse mahasiswaResponse= mahasiswaService.create(createMahasiswaRequest);

        return new webResponse(200,
                "ok",
                mahasiswaResponse);

    }

}
