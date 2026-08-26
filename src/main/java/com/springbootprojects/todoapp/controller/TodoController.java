package com.springbootprojects.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springbootprojects.todoapp.repository.TodoRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class TodoController {

	private final TodoRepository todorepository;
	
	@GetMapping({"","/","/home"})
	public String showHomePage(Model model)
	{
		model.addAttribute("todos",todorepository.findAll());
		return "index";
	}
}
