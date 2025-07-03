package java0703;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LyricAnalyzer5 {
    public List<String> readLyric(String filename) throws FileNotFoundException {
        // 方法一
        List<String> lyricsLines = new ArrayList<String>();

        // api
        /*https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/FileReader.html*/
        try (FileReader fr = new FileReader(filename);
             LineNumberReader lnr = new LineNumberReader(fr);) {
            // api
            /*https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/LineNumberReader.html*/

            String line = null;
            while ((line = lnr.readLine()) != null) {
                lyricsLines.add(line);
                System.out.println(line);
            }
            System.out.println("before close");
        }
        //這裡不寫也可以，因為FileNotFoundException的父類別是IOException
//        catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();
//        }
        catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("finally process");
        }
        return lyricsLines;
    }

    public void writeResult(String keyword, List<String> lines, String fileName) {
        int counter = 0;
        for (String line : lines) {
            while (line.indexOf(keyword) != -1) {
                counter++;
                line = line.substring(line.indexOf(keyword) + 1);
            }
        }
        System.out.println(keyword + "共出現了" + counter + "次");
        try (FileWriter fw = new FileWriter(fileName);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(keyword + "共出現了" + counter + "次");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LyricAnalyzer5 la = new LyricAnalyzer5();
        try {
            List<String> lines = la.readLyric("src/java0703/lyric.txt");

            la.writeResult("神", lines, "src/java0703/result.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("結尾");
    }
}
