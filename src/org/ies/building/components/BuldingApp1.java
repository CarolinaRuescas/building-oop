package org.ies.building.components;

import org.ies.building.model.Building;

import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class BuldingApp1 {
    private final BuildingReader buildingReader;
    private final Scanner scanner;

    public BuldingApp1(BuildingReader buildingReader, Scanner scanner) {
        this.buildingReader = buildingReader;
        this.scanner = scanner;
    }
    public void run(){
        var building = buildingReader.read();
        System.out.println("Consulta un apartamento");
        System.out.println("Ingresa un piso: ");
        int floor = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingresa una puerta: ");
        String doorway = scanner.nextLine();
        var appartment = building.findAppartment(floor, doorway);

        if (appartment == null){
            System.out.println("No se encuentra le apartamento: ");
        }else{
            appartment.showInfo();
        }
        building.showFloorAppartments(2);
    }

}
