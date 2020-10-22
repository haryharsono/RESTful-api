package com.haryharsono.controller;

import com.haryharsono.error.NotFoundException;
import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import com.haryharsono.model.updateMahasiswaRequest;
import com.haryharsono.model.webResponse;
import com.haryharsono.service.mahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(
            value = "/api/mahasiswa/{idMahasiswa}",
            produces = "application/json")
    private webResponse<mahasiswaResponse> getMahasiswa(@PathVariable("idMahasiswa") String id) throws NotFoundException {
        mahasiswaResponse mahasiswaResponse=mahasiswaService.get(id);
        return new webResponse(200,
                "ok",
                mahasiswaResponse);
    }
    @PutMapping(
            value = "/api/mahasiswa/{idMahasiswa}",
            produces = "application/json",
            consumes = "application/json")
    private webResponse<mahasiswaResponse> updateMahasiswa(@PathVariable("idMahasiswa") String id,@RequestBody updateMahasiswaRequest updateMahasiswaRequest)
            throws NotFoundException {
        mahasiswaResponse mahasiswaResponse=mahasiswaService.update(id,updateMahasiswaRequest);
        return new webResponse(
                200,
                "ok",
                mahasiswaResponse);
    }
    @DeleteMapping(
            value = "api/mahasiswa/{idMahasiswa}",
            produces = "application/json")
    private webResponse<String> deleteMahasiswa(@PathVariable("idMahasiswa") String id) throws NotFoundException {
        mahasiswaService.delete(id);
        return new webResponse(
                200,
                "ok",
                id);
    }
}
