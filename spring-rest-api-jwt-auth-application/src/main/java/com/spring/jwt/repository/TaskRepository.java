package com.spring.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.jwt.domain.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

}
