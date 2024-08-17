package com.mfqueiroga.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfqueiroga.course.entities.enums.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{

}
