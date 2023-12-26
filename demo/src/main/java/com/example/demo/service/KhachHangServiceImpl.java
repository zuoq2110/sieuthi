package com.example.demo.service;

import com.example.demo.dao.KhachHangRepository;
import com.example.demo.entity.KhachHang;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class KhachHangServiceImpl implements KhachHangService{
    KhachHangRepository khachHangRepository;
    @Autowired
    public KhachHangServiceImpl(KhachHangRepository khachHangRepository){
        this.khachHangRepository = khachHangRepository;
    }
    @Override
    public List<KhachHang> getAllKhachHang() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang getKhachHangById(int id) {
        return khachHangRepository.getById(id);
    }

    @Override
    @Transactional
    public KhachHang addKhachHang(KhachHang khachHang) {
        return khachHangRepository.save(khachHang);
    }

    @Override
    @Transactional
    public KhachHang updateKhachHang(KhachHang khachHang) {
        return khachHangRepository.saveAndFlush(khachHang);
    }

    @Override
    @Transactional
    public void deleteKhachHangById(int id) {
this.khachHangRepository.deleteById(id);
    }
}
