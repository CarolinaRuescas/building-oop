import org.ies.building.components.AppartmentReader;
import org.ies.building.components.BuildingReader;
import org.ies.building.components.OwnerReader;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var ownerReader = new OwnerReader(scanner);
        var appartmentReader = new AppartmentReader(scanner, ownerReader);
        var buildingReader = new BuildingReader(scanner, appartmentReader);



        var building = buildingReader.read();

        System.out.println(building);
    }
}