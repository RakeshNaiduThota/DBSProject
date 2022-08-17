package com.project.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.models.Receiver;

@Repository
public interface ReceiverRepo extends JpaRepository<Receiver, Integer> {

}
