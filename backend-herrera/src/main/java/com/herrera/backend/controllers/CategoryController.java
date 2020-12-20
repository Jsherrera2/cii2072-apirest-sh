package com.herrera.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.herrera.backend.models.entities.Category;
import com.herrera.backend.services.interfaces.ICategoryService;

@RestController
@RequestMapping("/api/category")//URL que va a gestionar 
public class CategoryController {

	//controlador gestiona las peticiones del usuario atraves de una url
	@Autowired//se inyectan las interfaces de los servicios
	private ICategoryService service;
	
	@GetMapping("/{id}")
	public Category retrive(@PathVariable(value="id") Long id){
		return service.findById(id);	
	}
	
	@GetMapping("")
	public List<Category>list(){
		return service.findAll();	
	}
	
}
