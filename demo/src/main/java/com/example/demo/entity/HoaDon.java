package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.List;

@Entity
@Data
@Table(name="hoadon")
public class HoaDon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="mahd")
private int maHD;
@Column(name="ngaytao")
private Date ngayTao;
@Column(name="soluong")
private int soLuong;
@Column(name="vat")
private double VAT;
@Column(name="tongtien")
private int tongTien;
@ManyToOne(fetch = FetchType.LAZY, cascade = {
        CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
})
@JoinColumn(name="makh", nullable = false)
private KhachHang khachHang;


}
