package com.mfqueiroga.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfqueiroga.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{

}
