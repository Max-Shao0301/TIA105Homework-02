package work02;
//請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class Homework07 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 1; i <= 6 ; i++) {
            for (int j = 1; j <= i ; j++) {
                if (count == 1) {
                    System.out.print("A");
                } else if (count == 2) {
                    System.out.print("B");
                } else if (count == 3) {
                    System.out.print("C");
                } else if (count == 4) {
                    System.out.print("D");
                } else if (count == 5) {
                    System.out.print("E");
                } else if (count == 6) {
                    System.out.print("F");
                }
            }
            count ++;
            System.out.println();
        }
    }
}
