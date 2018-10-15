package com.example.demo.Repository;

import com.example.demo.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u where u.id = :id")
    public User  findAgentById(@Param("id") Long id);
}
