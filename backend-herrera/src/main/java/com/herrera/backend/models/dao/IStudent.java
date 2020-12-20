package com.herrera.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.herrera.backend.models.entities.Student;

public interface IStudent extends CrudRepository <Student, Long>{

}
