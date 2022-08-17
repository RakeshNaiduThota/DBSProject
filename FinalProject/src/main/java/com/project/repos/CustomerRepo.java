package com.project.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Customers;
import com.project.models.Employee;

@Repository
public interface CustomerRepo extends JpaRepository<Customers,Integer> {
	Customers findByAccountNumber(String accountNumber);
}
