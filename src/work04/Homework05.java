package work04;

import java.util.Scanner;

//請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//        (提示1：Scanner，陣列)
//        (提示2：需將閏年條件加入)
//        (提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)
public class Homework05 {
    public static void main(String[] args) {
        new CountDay().count();
    }
}

class CountDay {
    public void count() {
        while (true) {
            int dayOfYear = 0;
            System.out.println("請輸入西元年份：");
            int year = new Scanner(System.in).nextInt();
            System.out.println("請輸入月份：");
            int month = new Scanner(System.in).nextInt();
            System.out.println("請輸入日期：");
            int day = new Scanner(System.in).nextInt();
            int[] dayInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            //閏年條件：判斷年份是不是4的倍數並且不能是100的倍數，但若是400的倍數也是閏年
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                dayInMonth[1] = 29;  //二月變成29天
            } else {
                dayInMonth[1] = 28;
            }
            //擋下錯誤輸入，並讓使用者從新輸入
            if (year < 0 || month < 1 || month > 12 ||
                    day < 1 || day > dayInMonth[month - 1]) { //month陣列索引從0開始 0 對應month 1
                System.out.println("Wrong Date!");
                continue;
            } else {
                //循環累計從1月到輸入的month-1的總天數
                //這裡month-1 是為了要計算month之前的月份天數
                //month之後的天數在最後加上使用者輸入的day就好
                for (int i = 0; i < month - 1; i++) {
                    dayOfYear += dayInMonth[i];
                }
                dayOfYear += day; //累計天數 + 使用著輸入的日期 = 總天數
                System.out.println("輸入的日期為該年的第 " + dayOfYear + " 天");
                break;
            }
        }
    }
}