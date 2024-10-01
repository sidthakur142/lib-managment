package com.example.library_management.converter;

import com.example.library_management.model.Student;
import com.example.library_management.requestDto.StudentRequestDto;

public class StudentConverter {
    public static Student convertStudent(StudentRequestDto studentRequest)
    {
       Student studentModel =  Student.builder().name(studentRequest.getName())
                               .age(studentRequest.getAge()).email(studentRequest.getEmail())
                               .gender(studentRequest.getGender()).mobile(studentRequest.getMobile()).build();
       return studentModel;
    }
}
