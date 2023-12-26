package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "khachhang")
public class KhachHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "makh")
    private int maKH;

    @Column(name = "hodem")
    private String hoDem;

    @Column(name = "ten")
    private String ten;

    @Column(name = "diachi")
    private String diaChi;

    @Column(name = "gioitinh")
    private String gioiTinh;

    @Column(name = "sdt")
    private String SDT;
    @OneToMany(mappedBy = "khachHang", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     List<HoaDon> danhSachHoaDon;
}
