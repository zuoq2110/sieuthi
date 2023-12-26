package com.example.demo.rest;

import com.example.demo.entity.KhachHang;
import com.example.demo.entity.NhaCungCap;
import com.example.demo.entity.NhapHang;
import com.example.demo.entity.NhapHang;
import com.example.demo.service.NhaCungCapService;
import com.example.demo.service.NhapHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/nhaphang")
public class NhapHangController {
    private NhapHangService nhapHangService;
    private NhaCungCapService nhaCungCapService;

    @Autowired
    public NhapHangController(NhapHangService nhapHangService, NhaCungCapService nhaCungCapService) {
        this.nhapHangService = nhapHangService;
        this.nhaCungCapService = nhaCungCapService;
    }

    @GetMapping("list")
    public String listAll(Model model){
        List<NhapHang> nhaphangs = nhapHangService.getAllNhapHang();
        model.addAttribute("nhaphangs", nhaphangs);
        return "thukho/nhaphang/nhaphang";
    }
    @GetMapping("create")
    public String create(Model model){
        NhapHang nhapHang = new NhapHang();
        model.addAttribute("nhapHang", nhapHang);
        return "thukho/nhaphang/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute NhapHang NhapHang){
        NhaCungCap nhaCungCap = NhapHang.getMaNhaCungCap();
        int id=nhaCungCap.getMaNhaCungCap();
        NhaCungCap ncc= nhaCungCapService.getNhaCungCapById(id);
        NhapHang.setMaNhaCungCap(ncc);
        nhaCungCapService.updateNhaCungCap(ncc);
        nhapHangService.addNhapHang(NhapHang);
        return "redirect:/nhaphang/list";
    }
    //
    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){
        NhapHang nhapHang= nhapHangService.getNhapHangById(id);
        model.addAttribute("nhapHang", nhapHang);
        return "/thukho/nhaphang/edit";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model){

        nhapHangService.deleteNhapHangById(id);
        return "redirect:/nhaphang/list";

    }
}
