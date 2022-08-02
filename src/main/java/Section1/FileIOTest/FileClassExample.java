package Section1.FileIOTest;

import java.io.File;
import java.io.IOException;

public class FileClassExample {
    public static void main(String[] args) throws IOException {

//        파일 생성하는 메서드
//        File file = new File("./", "newCodestates.txt");
//        file.createNewFile();

        File parentDir = new File("./");
        File[] list = parentDir.listFiles();

        String prefix = "code";

        for (int i = 0; i < list.length; i++) {
            String fileName = list[i].getName();

            if (fileName.endsWith("txt") && !fileName.startsWith("code")) {
                list[i].renameTo(new File(parentDir, prefix + fileName));
            }
        }
    }
}
