package com.xworkz.sport.app.dto;

import java.io.Serializable;

public class SportDTO implements Serializable {
	private String sportName;
	private int numberOfPlayers;
	private String equipment;
	private double fieldSize;
	private String rules;
	private String governingBody;
	private String origin;
	private boolean isTeamSport;
	private int yearEstablished;
	private String championshipName;

	public SportDTO() {

	}

	public SportDTO(String sportName, int numberOfPlayers, String equipment, double fieldSize, String rules,
			String governingBody, String origin, boolean isTeamSport, int yearEstablished, String championshipName) {
		super();
		this.sportName = sportName;
		this.numberOfPlayers = numberOfPlayers;
		this.equipment = equipment;
		this.fieldSize = fieldSize;
		this.rules = rules;
		this.governingBody = governingBody;
		this.origin = origin;
		this.isTeamSport = isTeamSport;
		this.yearEstablished = yearEstablished;
		this.championshipName = championshipName;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof SportDTO) {
				SportDTO ref = (SportDTO) obj;
				if (this.sportName.equals(ref.sportName) && this.championshipName.equals(ref.championshipName)) {
					System.out.println("Instance are same ");
					return true;

				}
			}
		}
		return super.equals(obj);
	}

	public String getSportName() {
		return sportName;
	}

	public void setSportName(String sportName) {
		this.sportName = sportName;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

	public double getFieldSize() {
		return fieldSize;
	}

	public void setFieldSize(double fieldSize) {
		this.fieldSize = fieldSize;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getGoverningBody() {
		return governingBody;
	}

	public void setGoverningBody(String governingBody) {
		this.governingBody = governingBody;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isTeamSport() {
		return isTeamSport;
	}

	public void setTeamSport(boolean isTeamSport) {
		this.isTeamSport = isTeamSport;
	}

	public int getYearEstablished() {
		return yearEstablished;
	}

	public void setYearEstablished(int yearEstablished) {
		this.yearEstablished = yearEstablished;
	}

	public String getChampionshipName() {
		return championshipName;
	}

	public void setChampionshipName(String championshipName) {
		this.championshipName = championshipName;
	}

	@Override
	public String toString() {
		return "SportDTO [sportName=" + sportName + ", numberOfPlayers=" + numberOfPlayers + ", equipment=" + equipment
				+ ", fieldSize=" + fieldSize + ", rules=" + rules + ", governingBody=" + governingBody + ", origin="
				+ origin + ", isTeamSport=" + isTeamSport + ", yearEstablished=" + yearEstablished
				+ ", championshipName=" + championshipName + "]";
	}

}
