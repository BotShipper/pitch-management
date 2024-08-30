package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "may")
@Data
public class May {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_may")
    private Integer id;

    @Column(name = "loai_may")
    private String loaiMay;

    @Column(name = "gia_gio_su_dung")
    private int giaGio;

    @Column(name = "tinh_trang")
    private boolean tinhTrang;

}
