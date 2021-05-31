package Case_study.Controllers;
import java.util.Scanner;


public class MainController {
    public static final String HOUSE_PATH = "src/Case_study/Data/House.csv";
    public static final String ROOM_PATH = "src/Case_study/Data/Room.csv";
    public static final String VILLA_PATH = "src/Case_study/Data/Villa.csv";
    public static final String COMMA = ",";
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu() {

        System.out.println("1. Add New Services");
        System.out.println("2. Show Services");
        System.out.println("3. Add New Customer");
        System.out.println("4. Show Information of Customer");
        System.out.println("5. Add New Booking");
        System.out.println("6. Show Information of Employee");
        System.out.println("7. Exit");
        System.out.println("Enter choose : ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1 : {
                int select = 0;
                System.out.println("1. Add New Villa");
                System.out.println("2. Add new House");
                System.out.println("3. Add New Room");
                System.out.println("4. Back to menu");
                System.out.println("5. Exit");
                System.out.println("Enter choose : ");
                select = Integer.parseInt(scanner.nextLine());
                addNewServices(select);
                break;
            }
            case 2 : {
                System.out.println("1. Show all Villa");
                System.out.println("2. Show all House");
                System.out.println("3. Show all Room");
                System.out.println("4. Show all name Villa not duplicate");
                System.out.println("5. Show all name House not duplicate");
                System.out.println("6. Show all name Room not duplicate");
                System.out.println("7. Back to menu");
                System.out.println("8. Exit");
                int select = Integer.parseInt(scanner.nextLine());
                showServices(select);
                break;
            }
            case 3 : {
                break;
            }
            case 4 : {
                break;
            }
            case 5 : {
                break;
            }
            case 6 : {
                break;
            }
            case 7 : {
                System.exit(0);
            }
        }
    }
    private static void addNewServices(int choose) {
        switch (choose) {
            case 1 : {
               VillaService.addNewVilla();
               break;
            }
            case 2 : {
                HouseService.addNewHouse();
                break;
            }
            case 3 : {
                RoomService.addNewRoom();
                break;
            }
            case 4 : {
                displayMainMenu();
                break;
            }
            case 5 : {
                System.exit(0);
            }
            default: {
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                addNewServices(choose);
            }
        }
    }
    private static void showServices(int choice) {
        switch (choice) {
            case 1 : {
                VillaService.showAllVilla();
                break;
            }
            case 2 : {
                HouseService.showAllHouse();
                break;
            }
            case 3 : {
                RoomService.showAllRoom();
                break;
            }
            case 4 : {
                VillaService.showAllVillaNotDuplicate();
                break;
            }
            case 5 : {
                HouseService.showAllHouseNotDuplicate();
                break;
            }
            case 6 : {
                RoomService.showAllRoomNotDuplicate();
                break;
            }
            case 7 : {
                displayMainMenu();
                break;
            }
            case 8 : {
                System.exit(0);
            }
            default: {
                System.out.println("fail !press enter to again");
                scanner.nextLine();
                showServices(choice);
            }
        }
    }



}
