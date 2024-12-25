package work04;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        new Robber().borrowMoney();
    }
}

class Robber {
    public void borrowMoney() {
        int[][] idAndMoney = {{25, 2500}, {32, 800},
                {8, 500}, {19, 1000}, {27, 1200}};
        while (true) {
            System.out.println("小華想借多少錢： ");
            int money = new Scanner(System.in).nextInt();
            if (money < 0) {
                System.out.println("money can't less than 0");
            } else {
                int count = 0;                      //統計次數用
                int[] id = new int [idAndMoney.length];
                for (int i = 0; i < idAndMoney.length ; i++) {
                    if (idAndMoney[i][1] >= money) {
                        id[count] = idAndMoney[i][0]; //保存ID
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("你要的太多了，大家沒錢");
                } else {
                    System.out.println("有錢可借的員工編號： ");
                    for (int i = 0; i < count ; i++) {
                        System.out.print(id[i] + "  ");
                    }
                    System.out.println("總共 " + count + " 人");
                }
                break;
            }
        }


    }

}