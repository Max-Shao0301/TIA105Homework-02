package work05;

import java.util.Random;

public class Homework05 {
    public static void main(String[] args) {
        new AuthCode().genAuthCode();
    }
}

class AuthCode {
    public void genAuthCode() {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        char[] charArray = str.toCharArray();
        Random random = new Random();
        System.out.println("本次隨機產生的驗證碼為：");
        for (int i = 0; i < 8; i++) {
            char c = charArray[random.nextInt(charArray.length)];
            System.out.print(c);
        }
    }
}