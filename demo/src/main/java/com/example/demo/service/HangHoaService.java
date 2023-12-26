package com.example.demo.service;

import com.example.demo.entity.HangHoa;
import com.example.demo.entity.HoaDon;

import java.util.List;

public interface HangHoaService {
    public List<HangHoa> getAllHangHoa();

    public HangHoa getHangHoaById(int id);

    public HangHoa addHangHoa(HangHoa hangHoa);

    public HangHoa updateHangHoa(HangHoa hangHoa);

    public void deleteHangHoaById(int id);
}
