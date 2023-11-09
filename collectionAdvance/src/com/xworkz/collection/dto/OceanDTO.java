package com.xworkz.collection.dto;

public class OceanDTO implements Comparable<OceanDTO> {
    private String name;
    private double depth;
    private boolean saltwater;
    private String location;

    public OceanDTO() {
        super();
    }

    public OceanDTO(String name, double depth, boolean saltwater, String location) {
        super();
        this.name = name;
        this.depth = depth;
        this.saltwater = saltwater;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public boolean isSaltwater() {
        return saltwater;
    }

    public void setSaltwater(boolean saltwater) {
        this.saltwater = saltwater;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "OceanDTO [name=" + name + ", depth=" + depth + ", saltwater=" + saltwater + ", location=" + location + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        result = prime * result + ((location == null) ? 0 : location.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (saltwater ? 1231 : 1237);
        temp = Double.doubleToLongBits(depth);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        OceanDTO other = (OceanDTO) obj;
        if (location == null) {
            if (other.location != null)
                return false;
        } else if (!location.equals(other.location))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (saltwater != other.saltwater)
            return false;
        if (Double.doubleToLongBits(depth) != Double.doubleToLongBits(other.depth))
            return false;
        return true;
    }

    @Override
    public int compareTo(OceanDTO dtos) {
        return dtos.location.compareTo(this.location);
    }

}
