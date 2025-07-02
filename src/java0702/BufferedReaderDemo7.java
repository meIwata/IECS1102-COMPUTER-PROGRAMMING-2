package java0702;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderDemo7 {
    public static void main(String[] args) {
        // 方法一：
        try {
            // InputStreamReader 是一個橋樑，負責將底層的二進位資料（byte）依指定編碼（如 UTF-8）轉換成字符（char）
            // BufferedReader 對字符流進行緩衝，提高讀取效率，並提供方便的讀取方法（例如：readLine() 可讀取一整行字串）
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("請輸入你要處理的檔案名稱: ");
            String name = br.readLine(); // 可使用BufferedReader底下的readLine()方法把字串讀出來
            System.out.println("檔案名稱為: " + name);

            FileReader fileReader = new FileReader(name);
            LineNumberReader lineNumberReader = new LineNumberReader(fileReader);

            String line = null;
            int count = 0;
            List<String> lines = new ArrayList<>();
            while ((line = lineNumberReader.readLine()) != null) {
                if (line.contains("神")) {
                    lines.add(line);
                }
                int index = line.indexOf("神");
                while (index != -1) {
                    count++;
                    index = line.indexOf("神", index + 1);
                }
            }
            System.out.println("字元 '神' 出現的次數: " + count);

            System.out.print("請輸入你要寫物的檔案名稱: ");
            String outputFileName = br.readLine();
            System.out.println("輸出檔案名稱為: " + outputFileName);

            FileWriter fileWriter = new FileWriter(outputFileName);
            for(String lineHasYes: lines){
                fileWriter.write(lineHasYes + "\n");
            }
            fileWriter.write("字元 '神' 出現的次數: " + count);
            fileWriter.flush();

            lineNumberReader.close();
            fileWriter.close();

        } catch (IOException exception) {
            System.out.println("輸入錯誤");
        }
    }
}
// 測試要需要打上src/java0702/求神.txt
// 測試輸出檔案要打上src/java0702/count.txt