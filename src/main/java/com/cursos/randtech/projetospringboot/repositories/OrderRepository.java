package com.cursos.randtech.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.randtech.projetospringboot.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
