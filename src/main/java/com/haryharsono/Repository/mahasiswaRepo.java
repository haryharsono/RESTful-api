package com.haryharsono.Repository;

import com.haryharsono.Entity.mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface mahasiswaRepo extends JpaRepository<mahasiswa, String> {
    //query custom berhasil
    @Modifying
    @Query("delete from mahasiswa where umur=:umur")
    void deleteAll(@Param("umur") int umur);
}
