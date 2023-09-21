package com.xworkz.sport.app.repository;

import com.xworkz.sport.app.dto.SportDTO;

public class SportRepositoryImpl implements SportRepository {
	private SportDTO[] dtos = new SportDTO[TOTAL_SPORTS];
	int position;
	private SportDTO dto;

	@Override
	public boolean isExist(SportDTO dto) {
		for (int i = 0; i <= this.position; i++) {
			SportDTO temp = this.dtos[i];
			if (temp != null && temp.equals(dto)) {
				System.err.println("It can not store because it is having equal value");
				return true;
			}
		}
		return false;
	}

	@Override
	public void save(SportDTO dto) {
		System.out.println("Running save in SportRepositoryImpl....");
		if (this.position < TOTAL_SPORTS) {
			this.dtos[position] = dto;
			System.out.println("Stored " + dto + " in position" + this.position);
			position++;
		} else {
			System.err.println("Storage is full ,cannot store dto");
		}
	}

	@Override
	public SportDTO findBySportNameAndChampionshipName(String sportName, String championshipName) {

		System.out.println("Running findBySportNameAndChampionshipName....");
		System.out.println("Current position " + this.position);
		for (int i = 0; i <= this.position; i++) {
			dto = this.dtos[i];
			if (dto.getSportName().equals(sportName) && dto.getChampionshipName().equals(championshipName)) {
				System.out.println("Dto matched");
				return dto;

			}
		}
		System.err.println("Dto not matched");
		return SportRepository.super.findBySportName(sportName);
	}
}
