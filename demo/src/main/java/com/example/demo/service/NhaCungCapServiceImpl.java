package com.example.demo.service;

import com.example.demo.dao.NhaCungCapRepository;
import com.example.demo.entity.NhaCungCap;
import com.example.demo.entity.NhanVien;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhaCungCapServiceImpl implements NhaCungCapService{
    NhaCungCapRepository nhaCungCapRepository;
    @Autowired
    public NhaCungCapServiceImpl(NhaCungCapRepository nhaCungCapRepository){
        this.nhaCungCapRepository=nhaCungCapRepository;
    }

    @Override
    public List<NhaCungCap> getAllNhaCungCap() {
        return nhaCungCapRepository.findAll();
    }

    @Override
    public NhaCungCap getNhaCungCapById(int id) {
        return nhaCungCapRepository.getById(id);
    }

    @Override
    @Transactional
    public NhaCungCap addNhaCungCap(NhaCungCap nhaCungCap) {
        return nhaCungCapRepository.save(nhaCungCap);
    }

    @Override
    @Transactional
    public NhaCungCap updateNhaCungCap(NhaCungCap nhaCungCap) {
        return nhaCungCapRepository.saveAndFlush(nhaCungCap);
    }

    @Override
    @Transactional
    public void deleteNhaCungCapById(int id) {
this.nhaCungCapRepository.deleteById(id);
    }
}
