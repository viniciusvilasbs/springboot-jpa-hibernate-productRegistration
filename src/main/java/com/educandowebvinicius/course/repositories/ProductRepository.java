package com.educandowebvinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebvinicius.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
