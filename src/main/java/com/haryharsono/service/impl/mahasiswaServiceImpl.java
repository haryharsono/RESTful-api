package com.haryharsono.service.impl;

import com.haryharsono.Entity.mahasiswa;
import com.haryharsono.Repository.mahasiswaRepo;
import com.haryharsono.error.NotFoundException;
import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import com.haryharsono.model.updateMahasiswaRequest;
import com.haryharsono.service.mahasiswaService;
import com.haryharsono.validation.validationUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.Optional;

@Service
public class mahasiswaServiceImpl implements mahasiswaService {
    @Autowired
    mahasiswaRepo mahasiswaRepo;
    @Autowired
    validationUtil validationUtil;
    @Override
    public mahasiswaResponse create(createMahasiswaRequest createMahasiswaRequest) {
        validationUtil.validate(createMahasiswaRequest);
        mahasiswa mahasiswa=new mahasiswa();
        mahasiswa.setId(createMahasiswaRequest.getId());
        mahasiswa.setStambuk(createMahasiswaRequest.getStambuk());
        mahasiswa.setName(createMahasiswaRequest.getName());
        mahasiswa.setUmur(createMahasiswaRequest.getUmur());
        mahasiswa.setJurusan(createMahasiswaRequest.getJurusan());
        mahasiswa.setAgama(createMahasiswaRequest.getAgama());
        mahasiswa.setJenisKelamin(createMahasiswaRequest.getJenisKelamin());
        mahasiswa.setCreatedAt(new Date());
        mahasiswa.setUpdateAt(null);
        mahasiswaRepo.save(mahasiswa);
        return convertMahasiswaToMahasiswaResponse(mahasiswa);
    }
    @Override
    public mahasiswaResponse get(String id) throws  NotFoundException{
        Optional<mahasiswa> mahasiswa=mahasiswaRepo.findById(id);
        if(!mahasiswa.isPresent()){
            throw new NotFoundException();
        }else{
           return convertMahasiswaToMahasiswaResponse(mahasiswa.get());
        }
    }
    @Override
    public mahasiswaResponse update(String id, updateMahasiswaRequest updateMahasiswaRequest) throws NotFoundException {
        mahasiswa mahasiswa=mahasiswaRepo.findById(id).get();
        if(mahasiswa==null){
            throw new NotFoundException();
        }
        validationUtil.validate(updateMahasiswaRequest);

        mahasiswa.setStambuk(updateMahasiswaRequest.getStambuk());
        mahasiswa.setName(updateMahasiswaRequest.getName());
        mahasiswa.setUmur(updateMahasiswaRequest.getUmur());
        mahasiswa.setJurusan(updateMahasiswaRequest.getJurusan());
        mahasiswa.setAgama(updateMahasiswaRequest.getAgama());
        mahasiswa.setJenisKelamin(updateMahasiswaRequest.getJenisKelamin());
        mahasiswa.setUpdateAt(new Date());


        mahasiswaRepo.save(mahasiswa);
        return convertMahasiswaToMahasiswaResponse(mahasiswa);
    }

    private mahasiswaResponse convertMahasiswaToMahasiswaResponse(mahasiswa mahasiswa){
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
