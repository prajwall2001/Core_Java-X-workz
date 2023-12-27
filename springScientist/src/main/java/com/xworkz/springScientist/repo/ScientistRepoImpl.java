package com.xworkz.springScientist.repo;

import org.springframework.stereotype.Repository;

import com.xworkz.springScientist.dto.ScientistDTO;
@Repository
public class ScientistRepoImpl implements ScientistRepo {
public ScientistRepoImpl() {
System.out.println("invoking ScientistRepoImpl");}
	@Override
	public void save(ScientistDTO dto) {
		System.out.println("Invoking save in ScientistRepoImpl");
		System.out.println("DTO passed:" + dto);
	}
}
