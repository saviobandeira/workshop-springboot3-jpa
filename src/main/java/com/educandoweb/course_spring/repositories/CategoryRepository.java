package com.educandoweb.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course_spring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
