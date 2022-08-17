package com.project.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.BIC;

@Repository
public interface BICRepo extends JpaRepository<BIC, String>{
	BIC findByBic(String bic);
}
