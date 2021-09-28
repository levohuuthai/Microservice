package com.example.studentservice.controller;

import com.example.studentservice.VO.ReponseTemplateVO;
import com.example.studentservice.entity.Student;
import com.example.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
//@EnableEurekaClient
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping({"/id"})
    public ReponseTemplateVO getUserWithDepartment(@PathVariable("id") Long studentId){
        return studentService.getUserWithDepartment(studentId);
    }

}
