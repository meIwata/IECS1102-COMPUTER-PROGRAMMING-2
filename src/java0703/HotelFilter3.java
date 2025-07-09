package java0703;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelFilter3 {

    public void generateHotelInCityFile(String sourcefileName, String city, String resultFileName) {
        try {
            FileReader fileReader = new FileReader(sourcefileName);
            LineNumberReader lineReader = new LineNumberReader(fileReader);

            FileWriter fileWriter = new FileWriter(resultFileName);

            String line = null;
            Map<String, Integer> hotelMap = new HashMap<>();
            while ((line = lineReader.readLine()) != null) {
                if (line.contains(city)) {
                    String[] lineSpilt = line.split(",");
                    if (lineSpilt[7].endsWith("區") || lineSpilt[7].endsWith("鄉") || lineSpilt[7].endsWith("鎮") || lineSpilt[7].endsWith("市")) {
                        String country = lineSpilt[7];
                        Integer hotelCount = hotelMap.get(country);
                        if (hotelCount == null) {
                            hotelMap.put(country, 1); // key: "西區", value: 1
                        } else {
                            hotelMap.put(country, hotelCount + 1); // key: "西區", value: 2
                        }
                    }
                }
            }

            for (String key : hotelMap.keySet()) {
                String outputLine = key + "，有" + hotelMap.get(key) + "間飯店\n";
                System.out.println(outputLine);
                fileWriter.write(outputLine);
            }

            fileWriter.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * HW
     * 輸出結果:
     * 西屯區，有10間飯店
     * 北屯區，有10間飯店
     * 沙鹿區，有5間飯店．．．
     */
    public static void main(String[] args) {
        HotelFilter3 hotelFilter = new HotelFilter3();
        hotelFilter.generateHotelInCityFile("src/java0703/hotels.csv", "台北市", "src/java0703/taichung_hotels.csv");
    }

}


