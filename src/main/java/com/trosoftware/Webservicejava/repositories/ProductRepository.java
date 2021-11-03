package com.trosoftware.Webservicejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trosoftware.Webservicejava.entities.Category;


public interface ProductRepository extends JpaRepository<Category, Long> {
	 
}

