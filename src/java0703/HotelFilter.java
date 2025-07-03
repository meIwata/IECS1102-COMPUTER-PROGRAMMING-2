package java0703;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HotelFilter {
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
        // 從所有的旅館中，挑出在指定縣市的旅館
        // 並寫到指定的csv檔案中
        try (BufferedReader br = new BufferedReader(new FileReader(sourcefileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(resultFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.contains(city)) {
                    bw.write(line + "\n");
                }
            }
            System.out.println(city + "的旅館資訊已經輸出到 " + resultFileName);
        }
//        catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        /** HW
        輸出結果:
        西屯區，有10間飯店
        北屯區，有10間飯店
        沙鹿區，有5間飯店．．．

         */

    }

    public static void main(String[] args) {
        HotelFilter hotelFilter = new HotelFilter();
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
