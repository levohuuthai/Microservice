package com.example.khoa.controller;

import com.example.khoa.entity.Khoa;
import com.example.khoa.service.KhoaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/khoa")
@Slf4j
public class KhoaController {
    @Autowired
    private KhoaService khoaService;

    @PostMapping
    public Khoa saveKhoa(@RequestBody Khoa khoa) {
        log.info("inside saveKhoa method if Khoa controller");
        return khoaService.saveKhoa(khoa);
    }
        @GetMapping("/{id}")
    public Khoa findKhoaById(@PathVariable("id") Long khoaId){
        log.info("inside findKhoaById method if Khoa controller!");
        return khoaService.findKhoaId(khoaId);
    }

    @GetMapping
    public String helloWorld(){
        return "Hello ThaiLe!";
    }
}
