 package com.educandoweb.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	
}
