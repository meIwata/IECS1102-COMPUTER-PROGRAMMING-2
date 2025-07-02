package java0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo1 {
    public static void main(String[] args) {
        // 方法一：
        try {
            // InputStreamReader 是一個橋樑，負責將底層的二進位資料（byte）依指定編碼（如 UTF-8）轉換成字符（char）
            // BufferedReader 對字符流進行緩衝，提高讀取效率，並提供方便的讀取方法（例如：readLine() 可讀取一整行字串）
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("請輸入你的名字: ");
            String input = br.readLine(); // 可使用BufferedReader底下的readLine()方法把字串讀出來
            System.out.println("Hello " + input);
        } catch (IOException exception) {
            System.out.println("輸入錯誤");
        }
    }
}
