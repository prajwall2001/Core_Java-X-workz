package com.xworkz.collection.dto;

public class TowerDTO implements Comparable<TowerDTO> {
	private String name;
	private int height;
	private boolean hasObservationDeck;
	private String location;

	public TowerDTO() {
		super();
	}

	public TowerDTO(String name, int height, boolean hasObservationDeck, String location) {
		super();
		this.name = name;
		this.height = height;
		this.hasObservationDeck = hasObservationDeck;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public boolean hasObservationDeck() {
		return hasObservationDeck;
	}

	public void setObservationDeck(boolean hasObservationDeck) {
		this.hasObservationDeck = hasObservationDeck;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "TowerDTO [name=" + name + ", height=" + height + ", hasObservationDeck=" + hasObservationDeck
				+ ", location=" + location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + height;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + (hasObservationDeck ? 1231 : 1237);
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TowerDTO other = (TowerDTO) obj;
		if (height != other.height)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (hasObservationDeck != other.hasObservationDeck)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(TowerDTO dtos) {
		return this.name.compareTo(dtos.name);
	}
}
