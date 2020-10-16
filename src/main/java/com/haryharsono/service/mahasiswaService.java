package com.haryharsono.service;

import com.haryharsono.error.NotFoundException;
import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import org.springframework.stereotype.Service;



public interface mahasiswaService {

     mahasiswaResponse create(createMahasiswaRequest createMahasiswaRequest);

     mahasiswaResponse get(String id) throws NotFoundException;

}
