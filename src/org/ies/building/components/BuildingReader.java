package org.ies.building.components;

import org.ies.building.model.Appartment;
import org.ies.building.model.Building;

import java.util.Scanner;

public class BuildingReader {
    private final Scanner scanner;
    private final AppartmentReader appartmentReader;

    public BuildingReader(Scanner scanner, AppartmentReader appartmentReader) {
        this.scanner = scanner;
        this.appartmentReader = appartmentReader;
    }
    public Building read(){
        System.out.println("INTRODUCE LOS DATOS SOBRE EL EDIFICIO");
        System.out.println("Introduce la dirección: ");
        String address = scanner.nextLine();

        System.out.println(" Introduce el municipio: ");
        String town = scanner.nextLine();

        System.out.println("¿Cuántos apartamentos hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Appartment[] appartments = new Appartment[size];
        for (int i = 0; i < appartments.length; i++) {
            appartments[i] = appartmentReader.read();
        }
        return new Building(
                address,
                town,
                appartments
        );
    }
}
