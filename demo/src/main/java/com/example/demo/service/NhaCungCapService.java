package com.example.demo.service;

import com.example.demo.entity.NhaCungCap;
import com.example.demo.entity.NhanVien;

import java.util.List;

public interface NhaCungCapService {
    public List<NhaCungCap> getAllNhaCungCap();

    public NhaCungCap getNhaCungCapById(int id);

    public NhaCungCap addNhaCungCap(NhaCungCap nhaCungCap);

    public NhaCungCap updateNhaCungCap(NhaCungCap nhaCungCap);

    public void deleteNhaCungCapById(int id);
}
