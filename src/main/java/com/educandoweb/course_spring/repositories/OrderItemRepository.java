package com.educandoweb.course_spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course_spring.entities.OrderItem;
import com.educandoweb.course_spring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
