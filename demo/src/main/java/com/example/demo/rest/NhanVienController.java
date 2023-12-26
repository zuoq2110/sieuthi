package com.example.demo.rest;

import com.example.demo.entity.NhanVien;
import com.example.demo.service.NhanVienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("/nhanvien")
public class NhanVienController {
   private NhanVienService nhanVienService;

    @Autowired
    public NhanVienController(NhanVienService nhanVienService) {
        this.nhanVienService = nhanVienService;
    }

   @GetMapping("list")
    public String listAll(Model model){
        List<NhanVien> nhanviens = nhanVienService.getAllNhanVien();
        model.addAttribute("nhanviens", nhanviens);
        return "admin/qlnv/nhanvien";
   }
@GetMapping("create")
public String create(Model model){
        NhanVien nhanvien = new NhanVien();
        model.addAttribute("nhanvien", nhanvien);
        return "admin/qlnv/edit";
}

   @PostMapping("/save")
    public String save(@ModelAttribute NhanVien nhanVien){
         nhanVienService.addNhanVien(nhanVien);
         return "redirect:/nhanvien/list";
   }
//
    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){
        NhanVien nhanvien = nhanVienService.getNhanVienById(id);
        model.addAttribute("nhanvien", nhanvien);
        return "/admin/qlnv/edit";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model){

        nhanVienService.deleteNhanVienByMaNV(id);
        return "redirect:/nhanvien/list";

    }

}
