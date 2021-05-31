package Case_study.Controllers;

import Case_study.Commons.FileVillaCSV;
import Case_study.Commons.MyRegex;
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
            villa.setNameService(MyRegex.getName());
            System.out.println("Input standard room");
            villa.setRoomStandard(MyRegex.getName());
            System.out.println("Input facilities");
            villa.setFacilities(MyRegex.getName());
            System.out.println("Input swimming pool area");
            villa.setSwimmingPoolArea(MyRegex.getArea());
            System.out.println("Input number of floors");
            villa.setNumberOfFloors(MyRegex.getFloor());
            System.out.println("Input usable area");
            villa.setUsableArea(MyRegex.getArea());
            System.out.println("Input rent");
            villa.setRent(MyRegex.getName());
            System.out.println("Input people");
            villa.setMaxPeople(MyRegex.getNumberPeople());
            System.out.println("Input rent type");
            villa.setRentType(MyRegex.getName());
        } catch (Exception e){
            System.out.println("Input err");
        }
        listVilla.add(villa);
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
