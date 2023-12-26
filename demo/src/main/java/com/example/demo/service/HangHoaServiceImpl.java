package com.example.demo.service;

import com.example.demo.dao.HangHoaRepository;
import com.example.demo.entity.HangHoa;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HangHoaServiceImpl implements HangHoaService{
     private HangHoaRepository hangHoaRepository;

     public HangHoaServiceImpl(HangHoaRepository hangHoaRepository){
         this.hangHoaRepository=hangHoaRepository;
     }
    @Override
    public List<HangHoa> getAllHangHoa() {
        return hangHoaRepository.findAll();
    }

    @Override
    public HangHoa getHangHoaById(int id) {
        return hangHoaRepository.getById(id);
    }

    @Override
    public HangHoa addHangHoa(HangHoa hangHoa) {
        return hangHoaRepository.save(hangHoa);
    }

    @Override
    public HangHoa updateHangHoa(HangHoa hangHoa) {
        return hangHoaRepository.saveAndFlush(hangHoa);
    }

    @Override
    public void deleteHangHoaById(int id) {
this.hangHoaRepository.deleteById(id);
    }
}
