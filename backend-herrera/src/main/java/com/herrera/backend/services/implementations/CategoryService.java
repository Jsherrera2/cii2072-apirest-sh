package com.herrera.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.herrera.backend.models.dao.ICategory;
import com.herrera.backend.models.entities.Category;
import com.herrera.backend.services.interfaces.ICategoryService;
@Service //anotacion para hacer controlador
public class CategoryService implements ICategoryService{
	//Inyeccion de dependencia
	
	@Autowired
	private ICategory dao;

	
	@Override
	@Transactional(readOnly=true)
	public Category findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}


	@Override
	@Transactional(readOnly=true)
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return (List<Category>)dao.findAll();
	}

}
