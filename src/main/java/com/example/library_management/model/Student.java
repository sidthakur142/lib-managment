package com.example.library_management.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")
@Builder
public class Student {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="age")
    private int age;

    @Column(name="email")
    private String email;

    @Column(name="mobile")
    private String mobile;

    @Column(name="gender")
    private String gender;

    @JsonManagedReference
    @OneToOne(mappedBy = "student" ,cascade = CascadeType.ALL)
    private Card card;

}
