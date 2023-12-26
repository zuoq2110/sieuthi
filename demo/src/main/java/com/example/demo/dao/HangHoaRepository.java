package com.example.demo.dao;

import com.example.demo.entity.HangHoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "hang-hoa")
public interface HangHoaRepository extends JpaRepository<HangHoa, Integer> {
}
