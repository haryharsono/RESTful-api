package com.haryharsono.service;

import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import org.springframework.stereotype.Service;



public interface mahasiswaService {

     mahasiswaResponse create(createMahasiswaRequest createMahasiswaRequest);

}
