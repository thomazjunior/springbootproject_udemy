package com.cursos.randtech.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.randtech.projetospringboot.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
