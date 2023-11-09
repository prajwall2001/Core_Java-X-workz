package com.xworkz.collection.dto;

public class RobotDTO implements Comparable<RobotDTO> {
    private String name;
    private int power;
    private boolean autonomous;
    private String manufacturer;

    public RobotDTO() {
        super();
    }

    public RobotDTO(String name, int power, boolean autonomous, String manufacturer) {
        super();
        this.name = name;
        this.power = power;
        this.autonomous = autonomous;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean isAutonomous() {
        return autonomous;
    }

    public void setAutonomous(boolean autonomous) {
        this.autonomous = autonomous;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "RobotDTO [name=" + name + ", power=" + power + ", autonomous=" + autonomous + ", manufacturer=" + manufacturer + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + power;
        result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
        result = prime * result + (autonomous ? 1231 : 1237);
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
        RobotDTO other = (RobotDTO) obj;
        if (power != other.power)
            return false;
        if (manufacturer == null) {
            if (other.manufacturer != null)
                return false;
        } else if (!manufacturer.equals(other.manufacturer))
            return false;
        if (autonomous != other.autonomous)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(RobotDTO robot) {
        RobotDTO current = this;
        if (current.power == robot.power) {
            return 0;
        }
        if (current.power < robot.power) {
            return -1;
        }
        if(current.power > robot.power) {
        	return 44;
        }
        return 1;
    }
}
