package work07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Homework03 {
    public static void main(String[] args) throws IOException {
        Copy copy = new Copy();
        File file1 = new File("/Users/maxshao/Documents/javawork/175.jpeg");
        File file2 = new File("/Users/maxshao/Documents/javawork/new/180.jpeg");
        copy.copyFile(file1,file2);
    }
}

class Copy {
    public void copyFile(File file1, File file2) throws IOException {
        FileInputStream fis = new FileInputStream(file1);
        FileOutputStream fos = new FileOutputStream(file2);
        byte[] bytes = new byte[1024];
        int n;
        while ((n = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, n);
        }
        fos.close();
        fis.close();
    }
}