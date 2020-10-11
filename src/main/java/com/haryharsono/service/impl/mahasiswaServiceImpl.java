package com.haryharsono.service.impl;

import com.haryharsono.Entity.mahasiswa;
import com.haryharsono.Repository.mahasiswaRepo;
import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import com.haryharsono.service.mahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class mahasiswaServiceImpl implements mahasiswaService {

    @Autowired
    mahasiswaRepo mahasiswaRepo;

    @Override
    public mahasiswaResponse create(createMahasiswaRequest createMahasiswaRequest) {
        mahasiswa mahasiswa=new mahasiswa(
                createMahasiswaRequest.getId(),
                createMahasiswaRequest.getStambuk(),
                createMahasiswaRequest.getName(),
                createMahasiswaRequest.getUmur(),
                createMahasiswaRequest.getJurusan(),
                createMahasiswaRequest.getAgama(),
                createMahasiswaRequest.getJenisKelamin(),
                new Date(),null
        );

        mahasiswaRepo.save(mahasiswa);

        return new mahasiswaResponse(
                mahasiswa.getId(),
                mahasiswa.getStambuk(),
                mahasiswa.getName(),
                mahasiswa.getUmur(),
                mahasiswa.getJurusan(),
                mahasiswa.getAgama(),
                mahasiswa.getJenisKelamin(),
                mahasiswa.getCreatedAt(),
                mahasiswa.getUpdateAt());
    }
}