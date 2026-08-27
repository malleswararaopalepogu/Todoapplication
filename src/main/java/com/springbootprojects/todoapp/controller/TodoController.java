package com.springbootprojects.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springbootprojects.todoapp.entity.TodoEntity;
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
	
	@PostMapping("/add")
	public String add(@RequestParam String title)
	{
		TodoEntity newtodo=TodoEntity.builder().title(title).completed(false).build();
		todorepository.save(newtodo);
		return "redirect:/";
	}
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable Long id) 
	{
		TodoEntity existingentity=todorepository.findById(id).orElseThrow(()->new RuntimeException("Todo Not Found: "+id));
		existingentity.setCompleted(!existingentity.getCompleted());
		todorepository.save(existingentity);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable Long id)
	{
		TodoEntity existingentity=todorepository.findById(id).orElseThrow(()->new RuntimeException("Todo Not Found: "+id));
		todorepository.delete(existingentity);
		return "redirect:/";
	}
}
