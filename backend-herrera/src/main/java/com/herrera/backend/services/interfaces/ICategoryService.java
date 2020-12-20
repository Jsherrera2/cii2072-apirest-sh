package com.herrera.backend.services.interfaces;

import java.util.List;

import com.herrera.backend.models.entities.Category;

public interface ICategoryService {
	public Category findById(Long id);//retrieve
	public List<Category> findAll();//list

}
