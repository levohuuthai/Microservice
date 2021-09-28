package com.example.studentservice.service;

import com.example.studentservice.VO.Khoa;
import com.example.studentservice.VO.ReponseTemplateVO;
import com.example.studentservice.entity.Student;
import com.example.studentservice.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private RestTemplate restTemplate;

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
    public ReponseTemplateVO getUserWithDepartment(Long studentId) {
        ReponseTemplateVO vo = new ReponseTemplateVO();
        Student student = studentRepository.findById(studentId).get();
        vo.setStudent(student);
        Khoa khoa =
                restTemplate.getForObject("http://localhost:9002/khoa/"
                                + student.getKhoaId(),
                        Khoa.class);

        vo.setKhoa(khoa);

        return vo;
    }
}
