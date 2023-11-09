package com.xworkz.collection.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class SetelliteDTO implements Serializable{
	    private String name;
	    private int altitude;
	    private double mass;
	    private boolean isFunctional;
	    private char classification;
	    private short launchYear;
	    private long orbitRadius;
	    private float velocity;
	    private byte solarPanelCount;
	    private LocalDate launchDate;
	    private LocalDateTime updatedDate;
		public SetelliteDTO() {
			super();
		}
		public SetelliteDTO(String name, int altitude, double mass, boolean isFunctional, char classification,
				short launchYear, long orbitRadius, float velocity, byte solarPanelCount, LocalDate launchDate,
				LocalDateTime updatedDate) {
			super();
			this.name = name;
			this.altitude = altitude;
			this.mass = mass;
			this.isFunctional = isFunctional;
			this.classification = classification;
			this.launchYear = launchYear;
			this.orbitRadius = orbitRadius;
			this.velocity = velocity;
			this.solarPanelCount = solarPanelCount;
			this.launchDate = launchDate;
			this.updatedDate = updatedDate;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAltitude() {
			return altitude;
		}
		public void setAltitude(int altitude) {
			this.altitude = altitude;
		}
		public double getMass() {
			return mass;
		}
		public void setMass(double mass) {
			this.mass = mass;
		}
		public boolean isFunctional() {
			return isFunctional;
		}
		public void setFunctional(boolean isFunctional) {
			this.isFunctional = isFunctional;
		}
		public char getClassification() {
			return classification;
		}
		public void setClassification(char classification) {
			this.classification = classification;
		}
		public short getLaunchYear() {
			return launchYear;
		}
		public void setLaunchYear(short launchYear) {
			this.launchYear = launchYear;
		}
		public long getOrbitRadius() {
			return orbitRadius;
		}
		public void setOrbitRadius(long orbitRadius) {
			this.orbitRadius = orbitRadius;
		}
		public float getVelocity() {
			return velocity;
		}
		public void setVelocity(float velocity) {
			this.velocity = velocity;
		}
		public byte getSolarPanelCount() {
			return solarPanelCount;
		}
		public void setSolarPanelCount(byte solarPanelCount) {
			this.solarPanelCount = solarPanelCount;
		}
		public LocalDate getLaunchDate() {
			return launchDate;
		}
		public void setLaunchDate(LocalDate launchDate) {
			this.launchDate = launchDate;
		}
		public LocalDateTime getupdatedDate() {
			return updatedDate;
		}
		public void setUpdatedDate(LocalDateTime updatedDate) {
			this.updatedDate = updatedDate;
		}
		@Override
		public String toString() {
			return "SetelliteDTO [name=" + name + ", altitude=" + altitude + ", mass=" + mass + ", isFunctional="
					+ isFunctional + ", classification=" + classification + ", launchYear=" + launchYear
					+ ", orbitRadius=" + orbitRadius + ", velocity=" + velocity + ", solarPanelCount=" + solarPanelCount
					+ ", launchDate=" + launchDate + ", updatedDate=" + updatedDate + "]";
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + altitude;
			result = prime * result + classification;
			result = prime * result + (isFunctional ? 1231 : 1237);
			result = prime * result + ((updatedDate == null) ? 0 : updatedDate.hashCode());
			result = prime * result + ((launchDate == null) ? 0 : launchDate.hashCode());
			result = prime * result + launchYear;
			long temp;
			temp = Double.doubleToLongBits(mass);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + (int) (orbitRadius ^ (orbitRadius >>> 32));
			result = prime * result + solarPanelCount;
			result = prime * result + Float.floatToIntBits(velocity);
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
			SetelliteDTO other = (SetelliteDTO) obj;
			if (altitude != other.altitude)
				return false;
			if (classification != other.classification)
				return false;
			if (isFunctional != other.isFunctional)
				return false;
			if (updatedDate == null) {
				if (other.updatedDate != null)
					return false;
			} else if (!updatedDate.equals(other.updatedDate))
				return false;
			if (launchDate == null) {
				if (other.launchDate != null)
					return false;
			} else if (!launchDate.equals(other.launchDate))
				return false;
			if (launchYear != other.launchYear)
				return false;
			if (Double.doubleToLongBits(mass) != Double.doubleToLongBits(other.mass))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (orbitRadius != other.orbitRadius)
				return false;
			if (solarPanelCount != other.solarPanelCount)
				return false;
			if (Float.floatToIntBits(velocity) != Float.floatToIntBits(other.velocity))
				return false;
			return true;
		}
	    
	    
}
