package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Data
@Entity
@Table(name="nhaphang")
public class NhapHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="manhaphang")
    private int maNhapHang;
@Column(name="tenhang")
    private String tenHang;
    @Column(name="ngaynhap")
    private Date ngayNhap;
    @Column(name="soluong")
    private int soLuong;
    @OneToOne(cascade = {
            CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH
    })
    @JoinColumn(name="manhacungcap")
    private NhaCungCap maNhaCungCap;
}
