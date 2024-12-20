package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Appartment {
    private int floor;
    private String doorway;
    private Owner[] owners;

    public Appartment(int floor, String doorway, Owner[] owners) {
        this.floor = floor;
        this.doorway = doorway;
        this.owners = owners;
    }

    public void showInfo(){
        System.out.println("Planta: " + floor + "Nº de puerta: " + doorway + "Información de los propietario: ");
        for (var owner: owners){
            owner.showInfo();
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDoorway() {
        return doorway;
    }

    public void setDoorway(String doorway) {
        this.doorway = doorway;
    }

    public Owner[] getOwners() {
        return owners;
    }

    public void setOwners(Owner[] owners) {
        this.owners = owners;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appartment that = (Appartment) o;
        return floor == that.floor && Objects.equals(doorway, that.doorway) && Objects.deepEquals(owners, that.owners);
    }

    @Override
    public int hashCode() {
        return Objects.hash(floor, doorway, Arrays.hashCode(owners));
    }

    @Override
    public String toString() {
        return "Appartment{" +
                "tier=" + floor +
                ", doorway='" + doorway + '\'' +
                ", owners=" + Arrays.toString(owners) +
                '}';
    }
}
