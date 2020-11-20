package Case_study.Controllers;

import Case_study.Commons.FileRoomCSV;
import Case_study.Mode.Room;
import Case_study.Mode.Villa;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class RoomService {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Room> listRoom = new ArrayList<Room>();

    static void addNewRoom() {
        Room room = new Room("", "", "", "", "", "");

        try {
            System.out.println("Input Name Services");
            room.setNameService(scanner.nextLine());
            System.out.println("Input standard room");

            System.out.println("Input usable area");
            room.setUsableArea(scanner.nextLine());
            System.out.println("Input rent");
            room.setRent(scanner.nextLine());
            System.out.println("Input people");
            room.setMaxPeople(scanner.nextLine());
            System.out.println("Input rent type");
            room.setRentType(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("Input err");
        }
        listRoom.add((Room) room);
        FileRoomCSV.writeToCSV(listRoom);

    }

    public static void showAllRoom() {
        for (Room room : listRoom) {
            System.out.println("=================");
            System.out.println(room.toString());
            System.out.println("=================");
        }
        MainController.displayMainMenu();
    }

    public static void showAllRoomNotDuplicate() {
        Set<Room> listRoomNotDuplicate = new TreeSet();
        for (Room room : listRoom) {
            if (room.getNameService().equals("nameServices")) continue;
            listRoomNotDuplicate.add(room);
        }
        int i = 1;
        System.out.println("Danh sách các villa không bị trùng tên");
        for (Room room : listRoomNotDuplicate) {
            System.out.println(i + ". " + room.getNameService());
            i++;
        }
    }
}
