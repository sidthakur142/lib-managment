package com.example.library_management.repository;

import com.example.library_management.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction,Integer> {
}
