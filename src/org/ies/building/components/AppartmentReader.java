package org.ies.building.components;

import org.ies.building.model.Appartment;
import org.ies.building.model.Owner;

import java.util.Scanner;

public class AppartmentReader {
    private final Scanner scanner;
    private final OwnerReader ownerReader;

    public AppartmentReader(Scanner scanner, OwnerReader ownerReader) {
        this.scanner = scanner;
        this.ownerReader = ownerReader;
    }
    public Appartment read(){
        System.out.println("INTRODUCE LOS DATOS DEL APARTAMENTO");
        System.out.println("Introduce la planta: ");
        int tier = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Introduce la puerta: ");
        String doorway = scanner.nextLine();

        System.out.println("¿CUántos propietarios hay?");
        int size = scanner.nextInt();
        scanner.nextLine();

        Owner[] owners = new Owner[size];
        for (int i = 0; i < owners.length; i++) {
            owners[i] = ownerReader.read();
        }

        return new Appartment(
                tier,
                doorway,
                owners
        );
    }

}
