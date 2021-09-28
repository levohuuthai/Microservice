package com.example.studentservice.VO;

import com.example.studentservice.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReponseTemplateVO {
    private Student student;
    private Khoa khoa;
}
