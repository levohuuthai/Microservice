package com.example.khoa.repository;


import com.example.khoa.entity.Khoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KhoaRepository extends JpaRepository<Khoa, Long> {
    //Khoa findDepartmentById(Long khoaId);
}