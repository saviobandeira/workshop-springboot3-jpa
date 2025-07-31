package com.educandoweb.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course_spring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
