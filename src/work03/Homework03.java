package work03;

import java.util.Arrays;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        new HateNum().inputHateNum();
    }
}

class HateNum {
    public void inputNum(int inputNum) {
        int count = 0;
        int [] randomNum = new int[50];
        for (int i = 1; i <= 49; i++) {
            if (i == inputNum ||
                    i == (inputNum + 10) ||
                    i == (inputNum + 20) ||
                    i == (inputNum + 30) ||
                    i == (inputNum + 40)) {
                continue;
            }
            System.out.print(i + "\t\t");
            count++;
            if (count % 6 == 0) {
                System.out.println();
            }
            randomNum[i] = i;
        }
        System.out.println("總共有" + count + "數字可選");
        printRandomNum(randomNum);
    }

    public void printRandomNum(int[] randomNum) {
        int count = 0;
        for (int i = 0; i <= 49; i++) {
            int randomIndex = (int) (Math.random() *49 + 1);
            if (randomNum[randomIndex] != 0 && count <= 6) {
                System.out.print(randomNum[randomIndex] + "\t\t");
                randomNum[randomIndex] = 0;
                count++;
            }
        }
        System.out.print("提供六個數字給您參考！");
    }

    public void inputHateNum() {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("阿文...請輸入你討厭哪個數字");
        int inputNum = scanner.nextInt();
        int[] randomNum = new int[50];
        switch (inputNum) {
            case 1:
                for (int i = 1; i <= 19; i++) {
                    if (i == 1) {
                        continue;
                    } else if (i == 10) {
                        break;
                    }
                    randomNum[i] = i;
                    System.out.print(i + "\t\t");
                    count++;
                    if (count % 6 == 0) {
                        System.out.println();
                    }
                }
                for (int i = 20; i <= 49; i++) {
                    if (i == 21 || i == 31 || i == 41) {
                        continue;
                    }
                    System.out.print(i + "\t\t");
                    count++;
                    if (count % 6 == 0) {
                        System.out.println();
                    }
                    randomNum[i] = i;
                }
                System.out.println("總共有" + count + "數字可選");
                printRandomNum(randomNum);
                break;
            case 2:
                for (int i = 1; i <= 29; i++) {
                    if (i == 2 || i == 12) {
                        continue;
                    } else if (i == 20) {
                        break;
                    }
                    System.out.print
                            (i + "\t\t");
                    count++;
                    if (count % 6 == 0) {
                        System.out.println();
                    }
                    randomNum[i] = i;
                }
                for (int i = 30; i <= 49; i++) {
                    if (i == 32 || i == 42) {
                        continue;
                    }
                    System.out.print(i + "\t\t");
                    count++;
                    if (count % 6 == 0) {
                        System.out.println();
                    }
                    randomNum[i] = i;
                }
                System.out.println("總共有" + count + "數字可選");
                printRandomNum(randomNum);
                break;
            case 3:
                for (int i = 1; i <= 39; i++) {
                    if (i == 3 || i == 13 || i == 23) {
                        continue;
                    } else if (i == 30) {
                        break;
                    }
                    System.out.print(i + "\t\t");
                    count++;
                    if (count % 6 == 0) {
                        System.out.println();
                    }
                    randomNum[i] = i;
                }
                for (int i = 40; i <= 49; i++) {
                    if (i == 43) {
                        continue;
                    }
                    System.out.print(i + "\t\t");
                    count++;
                    if (count % 6 == 0) {
                        System.out.println();
                    }
                    randomNum[i] = i;
                }
                System.out.println("總共有" + count + "數字可選");
                printRandomNum(randomNum);
                break;
            case 4:
                for (int i = 1; i <= 49; i++) {
                    if (i == 4 || i == 14 || i == 24 || i == 34) {
                        continue;
                    } else if (i == 40) {
                        break;
                    }
                    System.out.print(i + "\t\t");
                    count++;
                    if (count % 6 == 0) {
                        System.out.println();
                    }
                    randomNum[i] = i;
                }
                System.out.println("總共有" + count + "數字可選");
                printRandomNum(randomNum);
                break;
            case 5:
                inputNum(inputNum);
                break;
            case 6:
                inputNum(inputNum);
                break;
            case 7:
                inputNum(inputNum);
                break;
            case 8:
                inputNum(inputNum);
                break;
            case 9:
                inputNum(inputNum);
                break;
        }
    }

    public void challenge(int inputNum) {

    }
}