package com.mfqueiroga.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mfqueiroga.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
