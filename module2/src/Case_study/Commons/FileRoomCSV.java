package Case_study.Commons;

import Case_study.Mode.Room;
import Case_study.Mode.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Case_study.Controllers.MainController.*;

public class FileRoomCSV {
    public static final String LINE = "\n";

    public static void writeToCSV(List<Room> list) {
        File file = new File(VILLA_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LINE);
            for (Room room : list) {
                stringBuilder.append(room.getNameService()).append(COMMA);
                stringBuilder.append(room.getUsableArea()).append(COMMA);
                stringBuilder.append(room.getRent()).append(COMMA);
                stringBuilder.append(room.getMaxPeople()).append(COMMA);
                stringBuilder.append(room.getRentType()).append(COMMA);
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.flush();
                bufferedWriter.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Room> readCSV() {
        List<Room> roomList = new ArrayList<Room>();
        File file = new File(ROOM_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] split = line.split(",");
                if (split[0].equals("nameService")) {
                    continue;
                }
                Room room = new Room("","","","","","");
                room.setNameService(split[0]);
                room.setUsableArea(split[1]);
                room.setRent(split[2]);
                room.setMaxPeople(split[3]);
                room.setRentType(split[4]);

                roomList.add(room);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }
}
