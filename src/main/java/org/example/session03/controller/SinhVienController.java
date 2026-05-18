package org.example.session03.controller;

import org.example.session03.model.SinhVien;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public List<SinhVien> getAllSinhVien() {
        List<SinhVien> danhSach = new ArrayList<>();

        danhSach.add(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
        danhSach.add(new SinhVien("SV002", "Trần Thị B", 9.0));
        danhSach.add(new SinhVien("SV003", "Lê Văn C", 7.8));

        return danhSach;
    }
}