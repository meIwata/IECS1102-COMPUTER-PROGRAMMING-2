package java0703;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelFilter2 {
    public List<String> readHotel(String filename) throws IOException {
        // 讀hotel csv檔
        List<String> hotels = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = br.readLine()) != null) {
            hotels.add(line);
        }
        br.close();
        return hotels;
    }

    public void generateHotelInCityFile(String sourcefileName, String city, String resultFileName) {
        Map<String, Integer> districtCount = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(sourcefileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(resultFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(city)) {
                    bw.write(line + "\n");
                    // 根據 ,886 前的區名統計
                    int phoneIdx = line.indexOf(",886");
                    if (phoneIdx != -1) {
                        // 從 phoneIdx 向前找最近一個逗號
                        int lastCommaIdx = line.lastIndexOf(',', phoneIdx - 1);
                        if (lastCommaIdx != -1) {
                            String district = line.substring(lastCommaIdx + 1, phoneIdx).trim();
                            if (!district.isEmpty()) {
                                districtCount.put(district, districtCount.getOrDefault(district, 0) + 1);
                            }
                        }
                    }
                }
            }
            System.out.println(city + "的旅館資訊已經輸出到 " + resultFileName);
            // 按照需求格式輸出每個區的飯店數
            for (Map.Entry<String, Integer> entry : districtCount.entrySet()) {
                System.out.println(entry.getKey() + "，有" + entry.getValue() + "間飯店");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        HotelFilter2 hotelFilter = new HotelFilter2();
        try {
            List<String> hotels = hotelFilter.readHotel("src/java0703/hotels.csv");
            System.out.println("所有旅館資料: ");
            for (String hotel : hotels) {
                System.out.println(hotel);
            }
            // 產生台中市的旅館資料檔案
            hotelFilter.generateHotelInCityFile("src/java0703/hotels.csv", "台中市", "src/java0703/taichung_hotels.csv");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
