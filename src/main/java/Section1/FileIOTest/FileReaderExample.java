package Section1.FileIOTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            String fileName = "codestates.txt";
            FileReader file = new FileReader(fileName);
            // 버퍼를 사용하면 더 성능이 좋음
            BufferedReader buffered = new BufferedReader(file);

            int data = 0;

            while ((data = buffered.read()) != -1) {
                System.out.println((char) data);
            }
            file.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
