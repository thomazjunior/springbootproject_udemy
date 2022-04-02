package com.cursos.randtech.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.randtech.projetospringboot.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
	
}
