package Case_study.Commons;

import Case_study.Mode.House;
import Case_study.Mode.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Case_study.Controllers.MainController.*;

public class FileHouseCSV {
    public static final String LINE = "\n";

    public static void writeToCSV(List<House> list) {
        File file = new File(VILLA_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LINE);
            for (House house : list) {
                stringBuilder.append(house.getNameService()).append(COMMA);
                stringBuilder.append(house.getFacilities()).append(COMMA);
                stringBuilder.append(house.getRoomStandard()).append(COMMA);
                stringBuilder.append(house.getNumberOfFloors()).append(COMMA);
                stringBuilder.append(house.getUsableArea()).append(COMMA);
                stringBuilder.append(house.getRent()).append(COMMA);
                stringBuilder.append(house.getMaxPeople()).append(COMMA);
                stringBuilder.append(house.getRentType()).append(COMMA);
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.flush();
                bufferedWriter.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<House> readCSV() {
        List<House> houseList = new ArrayList<House>();
        File file = new File(HOUSE_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] split = line.split(",");
                if (split[0].equals("nameService")) {
                    continue;
                }
                House house = new House("","","","","","","","");
                house.setNameService(split[0]);
                house.setUsableArea(split[1]);
                house.setRent(split[2]);
                house.setMaxPeople(split[3]);
                house.setRentType(split[4]);
                house.setRoomStandard(split[5]);
                house.setFacilities(split[6]);
                house.setNumberOfFloors(split[7]);
                houseList.add(house);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }
}
