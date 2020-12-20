package com.herrera.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.herrera.backend.models.dao.IStudent;
import com.herrera.backend.models.entities.Student;
import com.herrera.backend.services.interfaces.IStudentService;

@Service
public class StudentService implements IStudentService{
	
	@Autowired
	private IStudent dao;

	@Override
	@Transactional
	public void save(Student student) {
		// TODO Auto-generated method stub
		try {
			dao.save(student);
		}catch(Exception ex) {
			throw ex;
			
		}
		
		
	}

	@Override
	@Transactional(readOnly=true)
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		try {
			dao.deleteById(id);
		}catch(Exception ex) {
			throw ex;
			
		}
		
	}

	@Override
	@Transactional(readOnly=true)
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>) dao.findAll();
	}

}
