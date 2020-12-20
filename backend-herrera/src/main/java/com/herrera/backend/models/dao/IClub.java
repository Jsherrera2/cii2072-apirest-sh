package com.herrera.backend.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.herrera.backend.models.entities.Club;


public interface IClub extends CrudRepository<Club, Long> {

}
