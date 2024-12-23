package work03;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        new GuessNum().guess0_9();
        System.out.println("您真棒！來挑戰0~100的猜數字吧！");
        new GuessNum().guess0_100();
    }
}

class GuessNum{
    public void guess0_9(){
        int correctNum = (int)(Math.random()*10);
        System.out.println("請開始猜數字吧！");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int guessNum = scanner.nextInt();
            if (guessNum == correctNum) {
                System.out.println("答對了！答案就是" + (correctNum));
                break;
            } else {
                System.out.println("猜錯囉");
            }
        }
    }
    public void guess0_100() {
        int correctNum = (int)(Math.random()*101);
        System.out.println("請開始猜數字吧！");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int guessNum = scanner.nextInt();
            if(guessNum == correctNum) {
                System.out.println("答對了！答案就是" + (correctNum));
                break;
            } else if(guessNum > correctNum) {
                System.out.println("答錯了！ 你輸入的答案 > 正確答案");
            } else {
                System.out.println("答錯了！ 你輸入的答案 < 正確答案");
            }
        }
    }
}