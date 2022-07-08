package com.educandowebvinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebvinicius.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
