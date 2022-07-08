package com.educandowebvinicius.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandowebvinicius.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
