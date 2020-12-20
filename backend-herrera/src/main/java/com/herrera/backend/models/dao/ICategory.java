package com.herrera.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.herrera.backend.models.entities.Category;

public interface ICategory extends CrudRepository<Category, Long>{

}
