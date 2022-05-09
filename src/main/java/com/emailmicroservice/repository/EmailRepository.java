package com.emailmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailmicroservice.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long>{

}
