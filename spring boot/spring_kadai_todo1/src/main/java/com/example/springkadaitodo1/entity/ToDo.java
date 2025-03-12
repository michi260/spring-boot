package com.example.springkadaitodo1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="todos")
@Data
public class ToDo{
	@Id
	@Column(name="id")
	private Integer todoId;
	
	@Column(name="title")
	private String todoTitle;
	
	@Column(name="priority")
	private String todoPriority;
	
	@Column (name="status")
	private String todoStatus;
	
	
	
}