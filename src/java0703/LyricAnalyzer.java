package java0703;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class LyricAnalyzer {
    public List<String> readLyric(String filename) {
        // 方法一
        List<String> lyricsLines = new ArrayList<String>();

        // api
        /*https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/FileReader.html*/
        try {
            FileReader fr = new FileReader(filename);
            LineNumberReader lnr = new LineNumberReader(fr);

            // api
            /*https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/io/LineNumberReader.html*/

            String line = null;
            while ((line = lnr.readLine()) != null) {
                lyricsLines.add(line);
                System.out.println(line);
            }
            lnr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return lyricsLines;
    }

    public static void main(String[] args) {
        LyricAnalyzer la = new LyricAnalyzer();
        List<String> lines = la.readLyric("src/java0703/lyric.txt");
    }
}
