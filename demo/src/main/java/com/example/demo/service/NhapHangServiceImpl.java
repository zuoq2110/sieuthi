package com.example.demo.service;

import com.example.demo.dao.NhapHangRepository;
import com.example.demo.entity.NhapHang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NhapHangServiceImpl implements NhapHangService{
private NhapHangRepository nhapHangRepository;
@Autowired
public NhapHangServiceImpl(NhapHangRepository nhapHangRepository){
    this.nhapHangRepository=nhapHangRepository;
}
    @Override
    public List<NhapHang> getAllNhapHang() {
        return nhapHangRepository.findAll();
    }

    @Override
    public NhapHang getNhapHangById(int id) {
        return nhapHangRepository.getById(id);
    }

    @Override
    public NhapHang addNhapHang(NhapHang nhapHang) {
        return nhapHangRepository.save(nhapHang);
    }

    @Override
    public NhapHang updateNhapHang(NhapHang nhapHang) {
        return nhapHangRepository.saveAndFlush(nhapHang);
    }

    @Override
    public void deleteNhapHangById(int id) {
this.nhapHangRepository.deleteById(id);
    }
}
