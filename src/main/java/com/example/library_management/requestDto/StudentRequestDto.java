package com.example.library_management.requestDto;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class StudentRequestDto {
    private String name;

    private int age;

    private String email;

    private String mobile;

    private String gender;
}
