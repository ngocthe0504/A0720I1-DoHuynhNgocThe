package Case_study.Commons;

import Case_study.Mode.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Case_study.Controllers.MainController.COMMA;
import static Case_study.Controllers.MainController.VILLA_PATH;

public class FileVillaCSV {
    public static final String LINE = "\n";

    public static void writeToCSV(List<Villa> list) {
        File file = new File(VILLA_PATH);
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(LINE);
            for (Villa villa : list) {
                stringBuilder.append(villa.getNameService()).append(COMMA);
                stringBuilder.append(villa.getFacilities()).append(COMMA);
                stringBuilder.append(villa.getRoomStandard()).append(COMMA);
                stringBuilder.append(villa.getNumberOfFloors()).append(COMMA);
                stringBuilder.append(villa.getSwimmingPoolArea()).append(COMMA);
                stringBuilder.append(villa.getUsableArea()).append(COMMA);
                stringBuilder.append(villa.getRent()).append(COMMA);
                stringBuilder.append(villa.getMaxPeople()).append(COMMA);
                stringBuilder.append(villa.getRentType()).append(COMMA);
                bufferedWriter.write(stringBuilder.toString());
                bufferedWriter.flush();
                bufferedWriter.close();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Villa> readCSV() {
        List<Villa> villaList = new ArrayList<Villa>();
        File file = new File(VILLA_PATH);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String [] split = line.split(",");
                if (split[0].equals("nameService")) {
                    continue;
                }
                Villa villa = new Villa("","","","","","","","","");
                villa.setNameService(split[0]);
                villa.setUsableArea(split[1]);
                villa.setRent(split[2]);
                villa.setMaxPeople(split[3]);
                villa.setRentType(split[4]);
                villa.setRoomStandard(split[5]);
                villa.setFacilities(split[6]);
                villa.setSwimmingPoolArea(split[7]);
                villa.setNumberOfFloors(split[8]);
                villaList.add(villa);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }
}
