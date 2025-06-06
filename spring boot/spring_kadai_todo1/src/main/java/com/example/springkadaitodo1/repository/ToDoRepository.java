package com.example.springkadaitodo1.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springkadaitodo1.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo,Integer>{
	
	List<ToDo> findAll(Integer todoId);
}