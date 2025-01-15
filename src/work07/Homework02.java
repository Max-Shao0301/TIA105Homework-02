package work07;

import java.io.*;

public class Homework02 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/maxshao/Documents/javawork/Data.txt");
        FileWriter fw = new FileWriter(file,true);
        PrintWriter pw = new PrintWriter(fw);
        for (int i = 1; i <= 10; i++) {
            int num = (int)(Math.random() * 1000) + 1;
            System.out.println(num);
            pw.println(num);
            pw.flush();
        }
        pw.println("------------");
        pw.flush();
        pw.close();
        fw.close();

    }
}
