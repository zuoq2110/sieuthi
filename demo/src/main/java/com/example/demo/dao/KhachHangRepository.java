package com.example.demo.dao;

import com.example.demo.entity.KhachHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "khach-hang")
public interface KhachHangRepository extends JpaRepository<KhachHang, Integer> {
}
