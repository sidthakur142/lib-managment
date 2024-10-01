package com.example.library_management.model;


import com.example.library_management.enums.TransactionName;
import com.example.library_management.enums.TransactionStatus;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int  id;


    @Column(name = "transaction-name")
    @Enumerated(value = EnumType.STRING)
    private TransactionName transactionName;

    @Column(name = "transaction-status")
    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    @Column(name = "fine")
    private Double fine;

    @Column(name = "transaction-date")
    @CreationTimestamp
    private Date transactionDate;

    @Column(name = "due-date")
    private Date dueDate;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn
    private Book book;

    @JsonManagedReference
    @ManyToOne
    @JoinColumn
    private Card card;
}
