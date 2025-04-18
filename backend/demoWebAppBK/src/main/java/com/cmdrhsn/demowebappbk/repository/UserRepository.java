package com.cmdrhsn.demowebappbk.repository;

//Repository Interface (UserRepository.java) – Data Access Layer
//Purpose
//  -   Spring Data JPA abstraction for CRUD operations.
//
//  -   No need to write SQL queries or implementations.

import com.cmdrhsn.demowebappbk.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

//Key Points
//Extends JpaRepository<T, ID>:
//
//T = Entity type (User).
//
//ID = Primary key type (Long).
//
//Predefined Methods:
//
//save(), findAll(), findById(), deleteById(), etc.
//
//Custom Queries:
//
//Just declare a method like findByEmail(), and Spring implements it!

public interface UserRepository extends JpaRepository<User, Long> {
    // Optional: Add custom queries (no implementation needed!)
    User findByEmail(String email);
}
