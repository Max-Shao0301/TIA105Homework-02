package work02;

public class Homework05 {
    public static void main(String[] args) {
        //阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
        //輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
        //4 14 24 34  40~49
        int count = 0;
        for (int i = 1; i <= 49 ; i++) {
            if (i == 4 || i == 14 || i == 24 || i == 34) {
                continue;
            }else if (i == 40) {
                break;
            }
            System.out.print(i + "\t");
            count++;
        }
        System.out.println("\n 一共有： " + count + "個");
    }
}
