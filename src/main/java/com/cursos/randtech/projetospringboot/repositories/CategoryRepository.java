package com.cursos.randtech.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.randtech.projetospringboot.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
