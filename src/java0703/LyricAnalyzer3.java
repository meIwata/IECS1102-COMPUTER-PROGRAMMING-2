package java0703;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class LyricAnalyzer3 {
    public List<String> readLyric(String filename) throws FileNotFoundException {
        // 方法一
        List<String> lyricsLines = new ArrayList<String>();
        FileReader fr = null;
        LineNumberReader lnr = null;

        // api
        /*https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/FileReader.html*/
        try {
            fr = new FileReader(filename);
            lnr = new LineNumberReader(fr);

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
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (lnr != null) {
                try {
                    lnr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("finally process");
        }
        return lyricsLines;
    }

    public static void main(String[] args) {
        LyricAnalyzer3 la = new LyricAnalyzer3();
        try {
            List<String> lines = la.readLyric("src/java0703/lyric.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("結尾");
    }
}
