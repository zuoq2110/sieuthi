package com.example.demo.service;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.NhaCungCap;

import java.util.List;

public interface KhachHangService {
    public List<KhachHang> getAllKhachHang();

    public KhachHang getKhachHangById(int id);

    public KhachHang addKhachHang(KhachHang khachHang);

    public KhachHang updateKhachHang(KhachHang khachHang);

    public void deleteKhachHangById(int id);
}
