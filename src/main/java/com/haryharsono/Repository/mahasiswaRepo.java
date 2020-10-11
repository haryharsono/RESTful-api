package com.haryharsono.Repository;

import com.haryharsono.Entity.mahasiswa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface mahasiswaRepo extends JpaRepository<mahasiswa, String> {
}
