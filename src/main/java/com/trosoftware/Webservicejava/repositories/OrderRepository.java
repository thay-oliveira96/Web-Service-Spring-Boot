package com.trosoftware.Webservicejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trosoftware.Webservicejava.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	 
}

