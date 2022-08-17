package com.project.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Long> {
	Employee findByEuname(String euname);
}
