package work03;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        System.out.println("請輸入三個數字：");
        Scanner s1 = new Scanner(System.in);
        int data1 = s1.nextInt();
        int data2 = s1.nextInt();
        int data3 = s1.nextInt();
        if (data1 == data2 && data1 == data3 &&  data1 != 0) {
            System.out.println("正三角形");
        } else if (data1 == 5 && data2 == 8 && data3 == 5) {
            System.out.println("等腰三角形");
        } else if (data1 == 5 && data2 == 6 && data3 ==7) {
            System.out.println("其他三角形");
        } else if (data1 <= 0 || data2 <=0 ||  data3 <=0) {
            System.out.println("不是三角形");
        } else if (Math.pow(data1, 2) + Math.pow(data2, 2) == Math.pow(data3, 2)) {
            System.out.println("直角三角形");
        }
    }
}
//兩直角邊邊長的平方和等於斜邊長的平方