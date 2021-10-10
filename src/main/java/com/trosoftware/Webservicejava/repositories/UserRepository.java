package com.trosoftware.Webservicejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trosoftware.Webservicejava.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
	 
}

