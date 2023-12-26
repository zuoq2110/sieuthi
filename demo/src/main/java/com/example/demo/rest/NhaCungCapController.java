package com.example.demo.rest;

import com.example.demo.entity.NhaCungCap;
import com.example.demo.entity.NhanVien;
import com.example.demo.service.NhaCungCapService;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping("/nhacungcap")
public class NhaCungCapController {
    private NhaCungCapService nhaCungCapService;

    @Autowired
    public NhaCungCapController(NhaCungCapService nhaCungCapService) {
        this.nhaCungCapService = nhaCungCapService;
    }

    @GetMapping("list")
    public String listAll(Model model){
        List<NhaCungCap> nhacungcaps = nhaCungCapService.getAllNhaCungCap();
        model.addAttribute("nhacungcaps", nhacungcaps);
        return "admin/qlncc/nhacungcap";
    }
    @GetMapping("create")
    public String create(Model model){
        NhaCungCap nhaCungCap = new NhaCungCap();
        model.addAttribute("nhaCungCap", nhaCungCap);
        return "admin/qlncc/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute NhaCungCap nhaCungCap){
        nhaCungCapService.addNhaCungCap(nhaCungCap);
        return "redirect:/nhacungcap/list";
    }
    //
    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){
        NhaCungCap nhaCungCap= nhaCungCapService.getNhaCungCapById(id);
        model.addAttribute("nhaCungCap", nhaCungCap);
        return "/admin/qlncc/edit";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model){

        nhaCungCapService.deleteNhaCungCapById(id);
        return "redirect:/nhacungcap/list";

    }
}
