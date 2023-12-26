package com.example.demo.service;

import com.example.demo.entity.NhanVien;
import com.example.demo.entity.NhapHang;

import java.util.List;

public interface NhapHangService {
    public List<NhapHang> getAllNhapHang();

    public NhapHang getNhapHangById(int id);

    public NhapHang addNhapHang(NhapHang nhapHang);

    public NhapHang updateNhapHang(NhapHang nhapHang);

    public void deleteNhapHangById(int id);
}
