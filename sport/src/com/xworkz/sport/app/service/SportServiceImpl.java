package com.xworkz.sport.app.service;

import com.xworkz.sport.app.dto.SportDTO;
import com.xworkz.sport.app.repository.SportRepository;

public class SportServiceImpl implements SportService {
	private SportRepository sportRepository;

	public SportServiceImpl(SportRepository sportRepository) {
		this.sportRepository = sportRepository;
	}

	@Override
	public boolean validateAndSave(SportDTO dto) {
		System.out.println("Running validateAndSave in SportServiceImpl....");
		if (dto != null) {
			System.out.println("dto is valid,store dto " + this.getClass().getSimpleName());
			
			String sportName=dto.getSportName();
			int numberOfPlayers=dto.getNumberOfPlayers();
			String equipment=dto.getEquipment();
			double fieldSize=dto.getFieldSize();
			String rules=dto.getRules();
			String governingBody=dto.getGoverningBody();
			String origin=dto.getOrigin();
			boolean isTeamSport=dto.isTeamSport();
			int yearEstablished=dto.getYearEstablished();
			String championshipName=dto.getChampionshipName();
			if (sportName != null && !sportName.isEmpty() && sportName.length() >= 3 && sportName.length() <= 50) {
				System.out.println("SportName " + dto.getSportName() + " is valid");
			} else {
				System.err.println("SportName " + dto.getSportName() + " is invalid");
			}
			if (numberOfPlayers > 0) {
				System.out.println("NumberOfPlayers " + dto.getNumberOfPlayers() + " is valid");
			} else {
				System.err.println("NumberOfPlayers " + dto.getNumberOfPlayers() + " is invalid");
			}
			if (equipment != null && !equipment.isEmpty() && equipment.length() >= 3 && equipment.length() <= 50) {
				System.out.println("Equipment " + dto.getEquipment() + " is valid");
			} else {
				System.err.println("Equipment " + dto.getEquipment() + " is invalid");
			}
			if (fieldSize > 0) {
				System.out.println("FieldSize " + dto.getFieldSize() + " is valid");
			} else {
				System.err.println("FieldSize " + dto.getFieldSize() + " is invalid");
			}
			if (rules != null && !rules.isEmpty() && rules.length() >= 3 && rules.length() <= 50) {
				System.out.println("Rules " + dto.getRules() + " is valid");
			} else {
				System.err.println("Rules " + dto.getRules() + " is invalid");
			}
			
			if (governingBody != null && !governingBody.isEmpty() && governingBody.length() >= 3 && governingBody.length() <= 50) {
				System.out.println("GoverningBody " + dto.getGoverningBody() + " is valid");
			} else {
				System.err.println("GoverningBody " + dto.getGoverningBody() + " is invalid");
			}
			if (origin != null && !origin.isEmpty() && origin.length() >= 3 && origin.length() <= 50) {
				System.out.println("Origin " + dto.getOrigin() + " is valid");
			} else {
				System.err.println("Origin " + dto.getOrigin() + " is invalid");
			}
			if (yearEstablished >1900) {
				System.out.println("YearEstablished " + dto.getYearEstablished() + " is valid");
			} else {
				System.err.println("YearEstablished " + dto.getYearEstablished() + " is invalid");
			}
			if (championshipName != null && !championshipName.isEmpty() && championshipName.length() >= 3 && championshipName.length() <= 50) {
				System.out.println("ChampionshipName " + dto.getChampionshipName() + " is valid");
			} else {
				System.err.println("ChampionshipName " + dto.getChampionshipName() + " is invalid");
			}
			
			if (!this.sportRepository.isExist(dto)) {
				System.out.println("Already exist");
				this.sportRepository.save(dto);
				return true;
			}

			else {
				System.err.println("Not exist");
			}
		} else {
			System.err.println("Cannot store ,dto is invalid");
		}

		return false;
	}
@Override
public SportDTO findBySportName(String sportName) {
	if(sportName!=null && !sportName.isEmpty()&& sportName.length()>=3 && sportName.length()<=40) {
		System.out.println("SportName is valid, will find");
		SportDTO dto=this.sportRepository.findBySportName(sportName);
		return dto;
	}
	else {
		System.out.println("SportName is invalid");
	}
	return SportService.super.findBySportName(sportName);
}
}