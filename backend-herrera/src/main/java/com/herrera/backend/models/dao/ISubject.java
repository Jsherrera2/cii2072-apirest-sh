package com.herrera.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.herrera.backend.models.entities.Subject;


public interface ISubject  extends CrudRepository<Subject, Long> {

}
