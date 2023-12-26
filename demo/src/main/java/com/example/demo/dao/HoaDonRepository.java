package com.example.demo.dao;

import com.example.demo.entity.HoaDon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path="hoa-don")
public interface HoaDonRepository extends JpaRepository<HoaDon, Integer> {
}
