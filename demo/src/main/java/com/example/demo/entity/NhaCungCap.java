package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="nhacungcap")
public class NhaCungCap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ma_ncc")
    private int maNhaCungCap;
    @Column(name="ten_ncc")
    private String tenNhaCungCap;
    @Column(name = "diachi")
    private String diaChi;
    @Column(name="sdt")
    private String SDT;
}
