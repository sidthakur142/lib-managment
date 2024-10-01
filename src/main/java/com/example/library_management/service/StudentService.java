package com.example.library_management.service;


import com.example.library_management.converter.StudentConverter;
import com.example.library_management.enums.CardStatus;
import com.example.library_management.model.Card;
import com.example.library_management.model.Student;
import com.example.library_management.repository.StudentRepository;
import com.example.library_management.requestDto.StudentRequestDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public String saveStudent(StudentRequestDto studentDto)
    {
        Student student = StudentConverter.convertStudent(studentDto);
        Card card = new Card();
        card.setCardStatus(CardStatus.ACTIVE);
        card.setStudent(student);
        student.setCard(card);

        studentRepository.save(student);
        return "Student saved successfully";
    }
}
