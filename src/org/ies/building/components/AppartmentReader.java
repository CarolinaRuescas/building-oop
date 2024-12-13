package org.ies.building.components;

import org.ies.building.model.Appartment;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class AppartmentReader {
    private final Scanner scanner;
    // se pone OwnerReader y no Owner porque aqui debe ponerse siempre otro componente
    private final OwnerReader ownerReader;

    public AppartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }

    public Appartment read(){
        System.out.println("INTRODUCE LOS DATOS DEL APARTAMENTO");
        System.out.println("Introduce la planta: ");
        int floor = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce la puerta: ");
        String doorway = scanner.nextLine();

        int numOwners = readNumOwners();

        Owner[] owners = new Owner[numOwners];
        for (int i = 0; i < owners.length; i++) {
            owners[i] = ownerReader.read();
        }

        return new Appartment(
                floor,
                doorway,
                owners
        );
    }

    // para que no metan un numero negativo (seria un plus hacerlo así)
    private int readNumOwners(){
        int numOwners;
        do{
            System.out.println("Cuantos propietarios hay?");
            numOwners = scanner.nextInt();
            scanner.nextLine();
        }while (numOwners < 0);
        return numOwners;
    }

}
