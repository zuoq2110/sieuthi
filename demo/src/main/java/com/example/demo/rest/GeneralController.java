package com.example.demo.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class GeneralController {
    @GetMapping("/admin/baocao")
    public String baoCao(){

        return "admin/baocao";
    }
    @GetMapping("/admin")
    public String Welcome(){

        return "admin/welcome";
    }
    @GetMapping("/nhanvien")
    public String Welcome2(){

        return "nhanvien/welcome";
    }
    @GetMapping("/nhanvien/thanhtoan")
    public String thanhToan(){

        return "nhanvien/thanhtoan/thanhtoan";
    }
    @GetMapping("/thukho")
    public String thuKho(){

        return "thukho/welcome";
    }
    @GetMapping("")
    public String login(){

        return "login";
    }
}
