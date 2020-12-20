package com.herrera.backend.services.interfaces;

import java.util.List;

import com.herrera.backend.models.entities.Student;

public interface IStudentService {
	
	public void save(Student student); //create-update
	public Student findById(Long id);//retrieve
	public void delete(Long id);
	public List<Student> findAll();
}
