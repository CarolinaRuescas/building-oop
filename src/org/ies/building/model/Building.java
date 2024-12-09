package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String town;
    private Appartment[] appartments;

    public Building(String address, String town, Appartment[] appartments) {
        this.address = address;
        this.town = town;
        this.appartments = appartments;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public Appartment[] getAppartments() {
        return appartments;
    }

    public void setAppartments(Appartment[] appartments) {
        this.appartments = appartments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Building building = (Building) o;
        return Objects.equals(address, building.address) && Objects.equals(town, building.town) && Objects.deepEquals(appartments, building.appartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, town, Arrays.hashCode(appartments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", town='" + town + '\'' +
                ", appartments=" + Arrays.toString(appartments) +
                '}';
    }
}
