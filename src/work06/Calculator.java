package work06;

import java.util.Scanner;

public class Calculator {
    public void powerXY() {
        double result, x, y;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入x的值： ");
        String strX = scanner.nextLine();
        System.out.println("請輸入y的值： ");
        String strY = scanner.nextLine();

        try {
            x = Double.parseDouble(strX); //用str轉換成double來檢查格式
            y = Double.parseDouble(strY);

            if (x == 0 && y == 0) {
                throw new CalException("0的0次方沒有意義");
            } else if (y < 0) {
                throw new CalException("次方為負值，結果回傳不為整數");
            }else {
                result = Math.pow(x, y);
                System.out.println((int)x + "的" + (int)y + "次方等於" + (int) result);
            }

        } catch (CalException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) { //接轉換格式異常並處理
            System.out.println("輸入格式不正確");
        }
    }
}
