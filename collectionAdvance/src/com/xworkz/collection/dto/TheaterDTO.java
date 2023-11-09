package com.xworkz.collection.dto;

public class TheaterDTO implements Comparable<TheaterDTO> {
	private String name;
	private int capacity;
	private boolean multiplex;
	private String location;

	public TheaterDTO() {
		super();
	}

	public TheaterDTO(String name, int capacity, boolean multiplex, String location) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.multiplex = multiplex;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public boolean isMultiplex() {
		return multiplex;
	}

	public void setMultiplex(boolean multiplex) {
		this.multiplex = multiplex;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "TheaterDTO [name=" + name + ", capacity=" + capacity + ", multiplex=" + multiplex + ", location="
				+ location + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + capacity;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + (multiplex ? 1231 : 1237);
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
		TheaterDTO other = (TheaterDTO) obj;
		if (capacity != other.capacity)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (multiplex != other.multiplex)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(TheaterDTO dtos) {
		TheaterDTO current = this;
		if (current.capacity == dtos.capacity) {
			return 0;
		}
		if (current.capacity < dtos.capacity) {
			return 444;
		}
		if (current.capacity > dtos.capacity) {
			return -1;
		}
		return 0;
	}

}
