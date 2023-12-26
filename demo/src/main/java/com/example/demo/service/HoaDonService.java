package com.example.demo.service;

import com.example.demo.entity.HoaDon;
import com.example.demo.entity.KhachHang;

import java.util.List;

public interface HoaDonService {
    public List<HoaDon> getAllHoaDon();

    public HoaDon getHoaDonById(int id);

    public HoaDon addHoaDon(HoaDon hoaDon);

    public HoaDon updateHoaDon(HoaDon hoaDon);

    public void deleteHoaDonById(int id);
}
