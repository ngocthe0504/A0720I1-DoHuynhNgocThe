package Case_study.Controllers;

import Case_study.Commons.FileVillaCSV;
import Case_study.Mode.Villa;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class VillaService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Villa> listVilla = new ArrayList<Villa>();
    static void addNewVilla() {
        Villa villa = new Villa("", "", "", "", "", "", "", "", "");

        try {
            System.out.println("Input Name Services");
            villa.setNameService(scanner.nextLine());
            System.out.println("Input standard room");
            villa.setRoomStandard(scanner.nextLine());
            System.out.println("Input facilities");
            villa.setFacilities(scanner.nextLine());
            System.out.println("Input swimming pool area");
            villa.setSwimmingPoolArea(scanner.nextLine());
            System.out.println("Input number of floors");
            villa.setNumberOfFloors(scanner.nextLine());
            System.out.println("Input usable area");
            villa.setUsableArea(scanner.nextLine());
            System.out.println("Input rent");
            villa.setRent(scanner.nextLine());
            System.out.println("Input people");
            villa.setMaxPeople(scanner.nextLine());
            System.out.println("Input rent type");
            villa.setRentType(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Input err");
        }
        listVilla.add((Villa) villa);
        FileVillaCSV.writeToCSV(listVilla);
    }

    public static void showAllVilla() {
        for (Villa villa : listVilla) {
            System.out.println("=================");
            System.out.println(villa.toString());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }
    public static void showAllVillaNotDuplicate() {
        Set<Villa> listVillaNotDuplicate = new TreeSet();
        for (Villa villa : listVilla) {
            if (villa.getNameService().equals("nameServices")) continue;
            listVillaNotDuplicate.add(villa);
        }
        int i = 1;
        System.out.println("Danh sách các villa không bị trùng tên");
        for (Villa villa : listVillaNotDuplicate) {
            System.out.println(i + ". " + villa.getNameService());
            i++;
        }
    }
}
