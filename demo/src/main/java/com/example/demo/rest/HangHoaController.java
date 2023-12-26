package com.example.demo.rest;

import com.example.demo.entity.HangHoa;
import com.example.demo.entity.KhachHang;
import com.example.demo.service.HangHoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/hanghoa")
public class HangHoaController {
    private HangHoaService hangHoaService;

    @Autowired
    public HangHoaController(HangHoaService hangHoaService) {
        this.hangHoaService = hangHoaService ;
    }

    @GetMapping("list")
    public String listAll(Model model){
        List<HangHoa> hanghoas = hangHoaService.getAllHangHoa();
        model.addAttribute("hanghoas", hanghoas);
        return "thukho/qlhh/hanghoa";
    }
    @GetMapping("create")
    public String create(Model model){
        HangHoa hangHoa = new HangHoa();
        model.addAttribute("hangHoa", hangHoa);
        return "thukho/qlhh/edit";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute HangHoa hangHoa){
        hangHoaService.addHangHoa(hangHoa);
        return "redirect:/hanghoa/list";
    }
    //
    @GetMapping("/update")
    public String update(@RequestParam("id") int id, Model model){
        HangHoa hangHoa= hangHoaService.getHangHoaById(id);
        model.addAttribute("hangHoa", hangHoa);
        return "thukho/qlhh/edit";

    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model){

        hangHoaService.deleteHangHoaById(id);
        return "redirect:/hanghoa/list";

    }
}
