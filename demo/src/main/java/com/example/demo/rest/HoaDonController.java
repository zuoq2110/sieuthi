package com.example.demo.rest;

import com.example.demo.entity.HoaDon;
import com.example.demo.entity.KhachHang;
import com.example.demo.service.HoaDonService;
import com.example.demo.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hoadon")
public class HoaDonController {
    private HoaDonService hoaDonService;

    private KhachHangService khachHangService;

    @Autowired
    public HoaDonController(HoaDonService hoaDonService, KhachHangService khachHangService) {
        this.hoaDonService= hoaDonService ;
        this.khachHangService = khachHangService;
    }

    @GetMapping("list")
    public String listAll(Model model){
        List<HoaDon> hoadons = hoaDonService.getAllHoaDon();
        KhachHang khachHang = new KhachHang();

        model.addAttribute("hoadons", hoadons);
        return "nhanvien/qlhd/hoadon";
    }
    @GetMapping("create")
    public String create(Model model){
        HoaDon hoaDon = new HoaDon();

        model.addAttribute("hoaDon", hoaDon);
//        model.addAttribute("hoadon",khachHang);
        return "nhanvien/qlhd/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute HoaDon hoaDon){

        KhachHang kh = hoaDon.getKhachHang();
        int id=kh.getMaKH();
        KhachHang khachHang=khachHangService.getKhachHangById(id);
        hoaDon.setKhachHang(khachHang);
        khachHangService.updateKhachHang(khachHang);

        hoaDonService.updateHoaDon(hoaDon);
        return "redirect:/hoadon/list";
    }
    //
    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){
        HoaDon hoaDon= hoaDonService.getHoaDonById(id);
//        KhachHang kh = hoaDon.getKhachHang();
//        int maKH=kh.getMaKH();
//        KhachHang khachHang=khachHangService.getKhachHangById(maKH);
//        hoaDon.setKhachHang(khachHang);
//        khachHangService.updateKhachHang(khachHang);
        model.addAttribute("hoaDon", hoaDon);
        return "nhanvien/qlhd/edit";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model){

        hoaDonService.deleteHoaDonById(id);
        return "redirect:/hoadon/list";

    }
}
