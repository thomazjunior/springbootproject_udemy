package com.cursos.randtech.projetospringboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursos.randtech.projetospringboot.entites.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
