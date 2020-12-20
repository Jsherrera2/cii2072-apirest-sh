package com.herrera.backend.services.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.herrera.backend.models.dao.IClub;
import com.herrera.backend.models.entities.Club;
import com.herrera.backend.services.interfaces.IClubService;

@Service//Decorador o Anotación
public class ClubService implements IClubService {
	
	@Autowired
	private IClub dao;//Data Access Object

	@Override
	@Transactional(readOnly=true)
	public Club findById(Long id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Club> findAll() {
		// TODO Auto-generated method stub
		return (List<Club>) dao.findAll();
	}

}
