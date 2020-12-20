package com.herrera.backend.services.interfaces;

import java.util.List;

import com.herrera.backend.models.entities.Club;

public interface IClubService {
	
	public Club findById(Long id);
	public List<Club> findAll();
	

}
