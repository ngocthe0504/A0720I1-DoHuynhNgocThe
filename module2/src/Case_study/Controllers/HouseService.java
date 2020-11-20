package Case_study.Controllers;

import Case_study.Commons.FileHouseCSV;
import Case_study.Mode.House;
import Case_study.Mode.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static Case_study.Controllers.VillaService.listVilla;

public class HouseService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<House> listHouse = new ArrayList<House>();

    static void addNewHouse() {
        House house = new House("", "", "", "", "", "", "", "");

        try {
            System.out.println("Input Name Services");
            house.setNameService(scanner.nextLine());
            System.out.println("Input standard room");
            house.setRoomStandard(scanner.nextLine());
            System.out.println("Input facilities");
            house.setFacilities(scanner.nextLine());
            System.out.println("Input swimming pool area");
            System.out.println("Input number of floors");
            house.setNumberOfFloors(scanner.nextLine());
            System.out.println("Input usable area");
            house.setUsableArea(scanner.nextLine());
            System.out.println("Input rent");
            house.setRent(scanner.nextLine());
            System.out.println("Input people");
            house.setMaxPeople(scanner.nextLine());
            System.out.println("Input rent type");
            house.setRentType(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Input err");
        }
        listHouse.add((House) house);
        FileHouseCSV.writeToCSV(listHouse);

    }

    public static void showAllHouse() {
        for (House house : listHouse) {
            System.out.println("=================");
            System.out.println(house.toString());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }

    public static void showAllHouseNotDuplicate() {
        Set<House> listHouseNotDuplicate = new TreeSet();
        for (House house : listHouse) {
            if (house.getNameService().equals("nameServices")) continue;
            listHouseNotDuplicate.add(house);
        }
        int i = 1;
        System.out.println("Danh sách các House không bị trùng tên");
        for (House house : listHouseNotDuplicate ) {
            System.out.println(i + ". " + house.getNameService());
            i++;
        }
    }
}
