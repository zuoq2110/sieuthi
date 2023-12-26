package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name = "hanghoa")
public class HangHoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mahang")
    private int maHang;
    @Column(name = "tenhang")
    private String tenHang;
    @Column(name = "gianhap")
    private int giaNhap;
    @Column(name = "giaban")
    private int giaBan;
    @Column(name = "ngaysanxuat")
    private Date ngaySanXuat;
    @Column(name = "hansudung")
    private Date hanSuDung;
}
