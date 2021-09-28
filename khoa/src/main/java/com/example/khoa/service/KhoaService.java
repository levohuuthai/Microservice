package com.example.khoa.service;

import com.example.khoa.entity.Khoa;
import com.example.khoa.repository.KhoaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KhoaService {
    @Autowired
    private KhoaRepository khoaRepository;
    public Khoa saveKhoa(Khoa khoa) {
        log.info("Inside saveKhoa of Service!");
        return khoaRepository.save(khoa);
    }
    public Khoa findKhoaId(Long khoaId) {
        log.info("Inside saveKhoa of Service!");
        return khoaRepository.findById(khoaId).get();
    }
}
