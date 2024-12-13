package org.ies.building.model;

import java.util.Arrays;
import java.util.Objects;

public class Building {
    private String address;
    private String city;
    private Appartment[] appartments;

    public Building(String address, String city, Appartment[] appartments) {
        this.address = address;
        this.city = city;
        this.appartments = appartments;
    }

    public void showInfo(){
        System.out.println("Dirección: " + address + " Municipio: " + city + "Nº de Apartamentos: ");
        for (var appartment: appartments){
            showInfo();
        }
    }

    // Dado una planta y una puerta devuelve el apartamento de esa planta y puerta. Si no
    // existe dicho apartamento devuvle null.

    public Appartment findAppartment (int floor, String doorway){
        for (var appartment : appartments){
            if (appartment.getFloor() == (floor) && appartment.getDoorway().equals(doorway)) {
                return appartment;
            }
        }
        return null;
    }

    //showFloorApartments(int floor): Dado un número de planta, muestra los
    //apartamentos de esa planta

    public void showFloorAppartments(int floor){
        for (var appartment : appartments){
            if (appartment.getFloor() == floor){
                appartment.showInfo();
            }
        }
    }

    //findOwners(int floor, String door): Dado una planta y una puerta, devuelve
    //  los propietarios del apartamento de esa puerta y planta. Si no existe dicho
    //  apartamento devuelve null.

    public Owner[] findAppartmentOwners(int floor, String doorway){
        var appartment = findAppartment(floor, doorway);
        if(appartment == null){
            return null;
        }else {
            return appartment.getOwners();
        }
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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
        return Objects.equals(address, building.address) && Objects.equals(city, building.city) && Objects.deepEquals(appartments, building.appartments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, city, Arrays.hashCode(appartments));
    }

    @Override
    public String toString() {
        return "Building{" +
                "address='" + address + '\'' +
                ", town='" + city + '\'' +
                ", appartments=" + Arrays.toString(appartments) +
                '}';
    }
}
