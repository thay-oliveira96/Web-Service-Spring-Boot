package com.trosoftware.Webservicejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trosoftware.Webservicejava.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	 
}

