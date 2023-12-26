package com.example.demo.rest;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.NhaCungCap;
import com.example.demo.service.KhachHangService;
import com.example.demo.service.NhaCungCapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/khachhang")
public class KhachHangController {
    private KhachHangService khachHangService;

    @Autowired
    public KhachHangController(KhachHangService khachHangService) {
        this.khachHangService = khachHangService ;
    }

    @GetMapping("list")
    public String listAll(Model model){
        List<KhachHang> khachhangs = khachHangService.getAllKhachHang();
        model.addAttribute("khachhangs", khachhangs);
        return "nhanvien/qlkh/khachhang";
    }
    @GetMapping("create")
    public String create(Model model){
        KhachHang khachHang = new KhachHang();
        model.addAttribute("khachHang", khachHang);
        return "nhanvien/qlkh/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute KhachHang khachHang){
        khachHangService.addKhachHang(khachHang);
        return "redirect:/khachhang/list";
    }
    //
    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){
        KhachHang khachHang= khachHangService.getKhachHangById(id);
        model.addAttribute("khachHang", khachHang);
        return "nhanvien/qlkh/edit";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model){

        khachHangService.deleteKhachHangById(id);
        return "redirect:/khachhang/list";

    }
}
