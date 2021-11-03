package com.trosoftware.Webservicejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trosoftware.Webservicejava.entities.Product;


public interface CategoryRepository extends JpaRepository<Product, Long> {
	 
}

