package com.example.demo.dao;

import com.example.demo.entity.NhapHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="nhap-hang")
public interface NhapHangRepository extends JpaRepository<NhapHang, Integer> {
}
