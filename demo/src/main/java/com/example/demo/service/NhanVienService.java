package com.example.demo.service;

import com.example.demo.entity.NhanVien;

import java.util.List;

public interface NhanVienService {
    public List<NhanVien> getAllNhanVien();

    public NhanVien getNhanVienById(int id);

    public NhanVien addNhanVien(NhanVien nhanVien);

    public NhanVien updateNhanVien(NhanVien nhanVien);

    public void deleteNhanVienByMaNV(int maNV);

}
