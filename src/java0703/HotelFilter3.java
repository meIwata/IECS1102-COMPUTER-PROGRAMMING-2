package java0703;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class HotelFilter3 {

    public void generateHotelInCityFile(String sourcefileName, String city, String resultFileName) {
        try (
                FileReader fileReader = new FileReader(sourcefileName);
                LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

                FileWriter fileWriter = new FileWriter(resultFileName);
                )
        {


            Map<String, Integer> hotelMap = new HashMap<>();
            String line = null;
            while ((line = lineNumberReader.readLine()) != null) {
                String[] lineSpilt = line.split(",");
                if (!line.isEmpty() && lineSpilt[6].equals(city)) {
                    if (lineSpilt[7].endsWith("區") || lineSpilt[7].endsWith("鄉") || lineSpilt[7].endsWith("鎮") || lineSpilt[7].endsWith("市")) {
                        String country = lineSpilt[7];
                        Integer hotelCount = hotelMap.get(country);
                        if (hotelCount == null) {
                            hotelMap.put(country, 1);
                        } else {
                            hotelMap.put(country, hotelCount + 1);
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
            e.printStackTrace();
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
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
        hotelFilter.generateHotelInCityFile("src/java0703/hotels.csv", "臺北市", "src/java0703/hotel_result.csv");
    }

}
