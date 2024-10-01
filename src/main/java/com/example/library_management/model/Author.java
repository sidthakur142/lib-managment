package com.example.library_management.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "country")
    private String country;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "age")
    private int age;

    @JsonManagedReference
    @OneToMany(mappedBy = "author",cascade = CascadeType.ALL  )
    private List<Book> booksWrittenByAuthor = new ArrayList<>();
}
