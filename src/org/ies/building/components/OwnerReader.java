package org.ies.building.components;

import org.ies.building.model.Owner;

import java.util.Scanner;

public class OwnerReader {
    private final Scanner scanner;

    public OwnerReader(Scanner scanner) {
        this.scanner = scanner;
    }
    public Owner read(){
        System.out.println("INTRODUCE LOS DATOS DEL PROPIETARIO");
        System.out.println("NIF: ");
        String nif = scanner.nextLine();

        System.out.println("NOMBRE: ");
        String name = scanner.nextLine();

        System.out.println("APELLIDO: ");
        String surname = scanner.nextLine();

        return new Owner(
                nif,
                name,
                surname
        );
    }
}
