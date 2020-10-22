package com.haryharsono.service;

import com.haryharsono.error.NotFoundException;
import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import com.haryharsono.model.updateMahasiswaRequest;
import org.springframework.stereotype.Service;



public interface mahasiswaService {

     mahasiswaResponse create(createMahasiswaRequest createMahasiswaRequest);

     mahasiswaResponse get(String id) throws NotFoundException;

     mahasiswaResponse update(String id, updateMahasiswaRequest updateMahasiswaRequest) throws NotFoundException;

     void delete(String id) throws  NotFoundException;

}
