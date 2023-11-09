package com.xworkz.collection.dto;

import java.io.Serializable;
import java.time.LocalDate;

public class GameDTO implements Serializable, Comparable<GameDTO> {
	private int id;
	private String name;
	private int participants;
	private int points;
	private LocalDate eventDate;
	private String winner;
	private String runnerUp;
	private int duration;

	public GameDTO() {
		super();
	}

	public GameDTO(int id, String name, int participants, int points, LocalDate eventDate, String winner,
			String runnerUp, int duration) {
		super();
		this.id = id;
		this.name = name;
		this.participants = participants;
		this.points = points;
		this.eventDate = eventDate;
		this.winner = winner;
		this.runnerUp = runnerUp;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParticipants() {
		return participants;
	}

	public void setParticipants(int participants) {
		this.participants = participants;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getRunnerUp() {
		return runnerUp;
	}

	public void setRunnerUp(String runnerUp) {
		this.runnerUp = runnerUp;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", name=" + name + ", participants=" + participants + ", points=" + points
				+ ", eventDate=" + eventDate + ", winner=" + winner + ", runnerUp=" + runnerUp + ", duration="
				+ duration + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + duration;
		result = prime * result + ((eventDate == null) ? 0 : eventDate.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + participants;
		result = prime * result + points;
		result = prime * result + ((runnerUp == null) ? 0 : runnerUp.hashCode());
		result = prime * result + ((winner == null) ? 0 : winner.hashCode());
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
		GameDTO other = (GameDTO) obj;
		if (duration != other.duration)
			return false;
		if (eventDate == null) {
			if (other.eventDate != null)
				return false;
		} else if (!eventDate.equals(other.eventDate))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (participants != other.participants)
			return false;
		if (points != other.points)
			return false;
		if (runnerUp == null) {
			if (other.runnerUp != null)
				return false;
		} else if (!runnerUp.equals(other.runnerUp))
			return false;
		if (winner == null) {
			if (other.winner != null)
				return false;
		} else if (!winner.equals(other.winner))
			return false;
		return true;
	}

	@Override
	public int compareTo(GameDTO other) {
		return Integer.compare(this.id, other.id);
	}
}
