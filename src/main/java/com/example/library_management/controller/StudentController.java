package com.example.library_management.controller;

import com.example.library_management.requestDto.StudentRequestDto;
import com.example.library_management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student/api")
public class StudentController {
    @Autowired
    private StudentService studentService;


    @PostMapping("/create")
    public String saveStudent(@RequestBody StudentRequestDto studentDto)
    {
       String response = studentService.saveStudent(studentDto);
       return response;
    }
}
