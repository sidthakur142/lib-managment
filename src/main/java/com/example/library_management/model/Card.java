package com.example.library_management.model;


import com.example.library_management.enums.CardStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @CreationTimestamp
    @Column(name = "created-on")
    private Date createdOn;

    @UpdateTimestamp
    @Column(name = "updated-on")
    private Date updatedOn;

    @Column(name = "card-status")
    @Enumerated(value= EnumType.STRING)
    private CardStatus cardStatus;

    @JsonManagedReference
    @OneToOne
    @JoinColumn
    private Student student;

    @JsonManagedReference
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    private List<Book> booksAssignedToCard = new ArrayList<>();

    @JsonManagedReference
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    private List<Transaction> transactionsByCard = new ArrayList<>();
}
