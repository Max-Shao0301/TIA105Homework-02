package work05;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        new PrintSquare().starSquare();
    }
}

class PrintSquare {
    public void starSquare() {
        System.out.println("請輸入寬度:");
        int width = new Scanner(System.in).nextInt();
        System.out.println("請輸入高度：");
        int height = new Scanner(System.in).nextInt();
        if (width <= 0 || height <= 0) {
            System.out.println("請不要輸入小於0的數字");
            return;
        }
        int[][] square = new int[width][height];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

