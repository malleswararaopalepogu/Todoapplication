package com.springbootprojects.todoapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="todo_table")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TodoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(nullable = false,unique = true)
	private String title;
	
	@Column()
	private Boolean completed;
}
