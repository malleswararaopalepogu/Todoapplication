package com.springbootprojects.todoapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootprojects.todoapp.entity.TodoEntity;

public interface TodoRepository extends JpaRepository<TodoEntity,Long>{

}
