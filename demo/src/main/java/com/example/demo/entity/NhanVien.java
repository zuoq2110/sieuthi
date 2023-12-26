package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Data
@Table(name="nhanvien")
public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="manv")
    private int maNV;

    @Column(name="hodem")
    private String hoDem;

    @Column(name="ten")
    private String ten;

    @Column(name = "gioitinh")
    private String gioiTinh;


    @Column(name="diachi")
    private String diaChi;

    @Column(name="sdt")
    private String SDT;
}
