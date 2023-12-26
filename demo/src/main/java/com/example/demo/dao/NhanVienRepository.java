package com.example.demo.dao;

import com.example.demo.entity.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "nhan-vien")
public interface NhanVienRepository extends JpaRepository<NhanVien, Integer> {
}
