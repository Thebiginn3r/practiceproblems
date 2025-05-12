package practice.problems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderPractice2 {
    public static void main(String[] args) {
        String targetValue = "line";
        try {
            BufferedReader reader = new BufferedReader(new FileReader("CounterPracticeFile.txt"));
            String line;
            while((line = reader.readLine()) != null) {
                if (line.contains(targetValue)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading files: " + e.getMessage());
        }
    }
}
