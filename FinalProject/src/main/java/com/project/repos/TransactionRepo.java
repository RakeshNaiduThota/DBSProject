package com.project.repos;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Transactions;

@Repository
public interface TransactionRepo extends JpaRepository<Transactions, Integer>{


}
