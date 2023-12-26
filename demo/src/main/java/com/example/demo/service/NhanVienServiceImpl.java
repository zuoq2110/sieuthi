package com.example.demo.service;

import com.example.demo.dao.NhanVienRepository;
import com.example.demo.entity.NhanVien;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhanVienServiceImpl implements NhanVienService{
    private NhanVienRepository nhanVienRepository;
    @Autowired
    public NhanVienServiceImpl(NhanVienRepository nhanVienRepository) {
        this.nhanVienRepository = nhanVienRepository;
    }

    @Override
    public List<NhanVien> getAllNhanVien() {
        return nhanVienRepository.findAll();
    }

    @Override
    public NhanVien getNhanVienById(int id) {
        return nhanVienRepository.getById(id);
    }

    @Override
    @Transactional
    public NhanVien addNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.save(nhanVien);
    }

    @Override
    @Transactional
    public NhanVien updateNhanVien(NhanVien nhanVien) {
        return nhanVienRepository.saveAndFlush(nhanVien);
    }

    @Override
    @Transactional
    public void deleteNhanVienByMaNV(int maNV) {
nhanVienRepository.deleteById(maNV);
    }
}
