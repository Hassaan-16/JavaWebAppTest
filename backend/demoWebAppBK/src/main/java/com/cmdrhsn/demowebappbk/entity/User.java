package com.cmdrhsn.demowebappbk.entity;

//4.1: Entity Class (User.java) – The Data Model
//Purpose
//  -   Defines the database schema (table structure) using Java objects.
//
//  -   Maps Java fields to MySQL columns via JPA annotations.

import jakarta.persistence.*;
        import lombok.Data;

@Entity  // JPA annotation: This class is a DB table
@Table(name = "users")  // Optional: Explicit table name (default: "user")
@Data   // Lombok: Auto-generates getters, setters, toString(), etc.
public class User {

    @Id  // Primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-increment
    private Long id;

    @Column(nullable = false)  // Adds NOT NULL constraint
    private String name;

    @Column(unique = true, nullable = false)  // Ensures email is unique + not null
    private String email;
}

//5. When Would You Need a Class?
//Only if you need custom queries that Spring can’t auto-generate. Example:

//public interface UserRepository extends JpaRepository<User, Long> {
//    // Custom JPQL query (manual SQL-like syntax)
//    @Query("SELECT u FROM User u WHERE u.name LIKE %:keyword%")
//    List<User> searchByName(@Param("keyword") String keyword);
//}
//Even here, you’re still defining the interface—Spring implements the method.