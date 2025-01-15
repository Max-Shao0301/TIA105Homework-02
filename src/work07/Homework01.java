package work07;

import java.io.*;

public class Homework01 {
    public static void main(String[] args) throws IOException {
        int num;
        String str;
        int row = 0;
        int countChar = 0;
        File file = new File("/Users/maxshao/Documents/javawork/Sample.txt");
        long fileByte = file.length();
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        while ((str = br.readLine()) != null) {
            row++;
            countChar += str.length();
            System.out.println(str);
        }
        br.close();
        fr.close();

        System.out.println("Sample.txt檔案共有:" + fileByte+ "個位元組 " + countChar + "個字元 " + row + "列資料");

    }
}
