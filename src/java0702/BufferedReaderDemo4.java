package java0702;

import java.io.*;

public class BufferedReaderDemo4 {
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
            while ((line = lineNumberReader.readLine()) != null) {
                while (line.contains("神")) {
                    count++;
                    System.out.println(line);
                    int index = line.indexOf("神");
                    line = line.substring(index + 1); // 更新line，從找到的字元後面繼續搜尋
                }
            }
            System.out.println("字元 '神' 出現的次數: " + count);


        } catch (IOException exception) {
            System.out.println("輸入錯誤");
        }
    }
}
// 測試要需要打上src/java0702/求神.txt