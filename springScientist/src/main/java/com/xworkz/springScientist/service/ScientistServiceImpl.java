package com.xworkz.springScientist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springScientist.dto.ScientistDTO;
import com.xworkz.springScientist.repo.ScientistRepo;

@Service
public class ScientistServiceImpl implements ScientistService {
	@Autowired
	private ScientistRepo repo;

	public ScientistServiceImpl() {
		System.out.println("Invoking no-args constr....");
	}

	@Override
	public boolean validateAndSave(ScientistDTO dto) {
		System.out.println("Invoking validateAndSave in ScientistService....");
		System.out.println("Dto passed:" + dto);
		this.repo.save(dto);
		return true;
	}

}
