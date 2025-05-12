package practice.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderPracticeApp {
    public static void main(String[] args) {
        int lineCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("CounterPracticeFile.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
                lineCount++;
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Total number of lines were " + lineCount);
    }
}
