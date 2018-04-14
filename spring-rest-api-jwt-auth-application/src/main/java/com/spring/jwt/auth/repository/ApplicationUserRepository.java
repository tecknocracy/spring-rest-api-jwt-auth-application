package com.spring.jwt.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jwt.auth.user.ApplicationUser;

public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {
    ApplicationUser findByUsername(String username);
}
