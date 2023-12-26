package com.example.demo.service;

import com.example.demo.dao.HoaDonRepository;
import com.example.demo.dao.KhachHangRepository;
import com.example.demo.entity.HoaDon;
import com.example.demo.entity.KhachHang;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HoaDonServiceImpl implements HoaDonService {
    private HoaDonRepository hoaDonRepository;
//    private KhachHangRepository khachHangRepository;
    @Autowired
    public HoaDonServiceImpl(HoaDonRepository hoaDonRepository){
        this.hoaDonRepository = hoaDonRepository;
//        this.khachHangRepository = khachHangRepository;
    }
    @Override
    public List<HoaDon> getAllHoaDon() {
//
//        KhachHang kh=khachHangRepository.getById(1);
//        HoaDon hoaDon = new HoaDon();
//        hoaDon.setKhachHang(kh);
        return hoaDonRepository.findAll();
    }

    @Override
    public HoaDon getHoaDonById(int id) {
        return hoaDonRepository.getById(id);
    }

    @Override
    public HoaDon addHoaDon(HoaDon hoaDon) {
        return hoaDonRepository.save(hoaDon);
    }

    @Override
    public HoaDon updateHoaDon(HoaDon hoaDon) {
        return hoaDonRepository.saveAndFlush(hoaDon);
    }

    @Override
    @Transactional
    public void deleteHoaDonById(int id) {
this.hoaDonRepository.deleteById(id);
    }
}
