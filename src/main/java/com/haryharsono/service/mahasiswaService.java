package com.haryharsono.service;

import com.haryharsono.error.NotFoundException;
import com.haryharsono.model.listMahasiswaRequest;
import com.haryharsono.model.createMahasiswaRequest;
import com.haryharsono.model.mahasiswaResponse;
import com.haryharsono.model.updateMahasiswaRequest;

import java.util.List;


public interface mahasiswaService {

     mahasiswaResponse create(createMahasiswaRequest createMahasiswaRequest);

     mahasiswaResponse get(String id) throws NotFoundException;

     mahasiswaResponse update(String id, updateMahasiswaRequest updateMahasiswaRequest) throws NotFoundException;

     void delete(String id) throws  NotFoundException;

     List<mahasiswaResponse> list(listMahasiswaRequest listMahasiswaRequest);

     void deleteAll(int umur) throws NotFoundException;
}
