package work07;

import java.io.*;

public class Homework05 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String pathName = "/Users/maxshao/Documents/data/Object.ser";
        File file = new File(pathName);
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            while (true) {
                Object o = ois.readObject();
                if (o instanceof Dog) {
                    ((Dog) o).speak();
                } else if (o instanceof Cat) {
                    ((Cat) o).speak();
                }
            }
        } catch (EOFException e) {
            System.out.println("資料讀取完畢！");;
        }
    }
}
