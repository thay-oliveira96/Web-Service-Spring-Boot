package com.trosoftware.Webservicejava.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trosoftware.Webservicejava.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	 
}

