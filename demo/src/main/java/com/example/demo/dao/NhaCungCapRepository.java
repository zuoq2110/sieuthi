package com.example.demo.dao;

import com.example.demo.entity.NhaCungCap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="nha-cung-cap")
public interface NhaCungCapRepository extends JpaRepository<NhaCungCap, Integer> {
}
