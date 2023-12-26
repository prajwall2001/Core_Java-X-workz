package com.xworkz.springScientist.service;

import org.springframework.stereotype.Service;

import com.xworkz.springScientist.dto.ScientistDTO;
@Service
public class ScientistServiceImpl implements ScientistService {
	public ScientistServiceImpl() {
		System.out.println("Invoking no-args constr....");
	}

	@Override
	public boolean validateAndSave(ScientistDTO dto) {
		System.out.println("Invoking validateAndSave in ScientistService....");
		System.out.println("Dto passed:" + dto);
		return true;
	}

}
