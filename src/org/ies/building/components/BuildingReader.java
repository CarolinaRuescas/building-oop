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
        String city = scanner.nextLine();

        int numAppartments = readNumAppartments();
        Appartment[] appartments = new Appartment[numAppartments];
        for (int i = 0; i < appartments.length; i++) {
            appartments[i] = appartmentReader.read();
        }
        return new Building(
                address,
                city,
                appartments
        );
    }

    // para que no metan un numero negativo (seria un plus hacerlo así)
    private int readNumAppartments(){
        int size;
        do{
            System.out.println("Cuantos propietarios hay?");
            size = scanner.nextInt();
            scanner.nextLine();

        }while (size < 0);
        return size;
    }
}
