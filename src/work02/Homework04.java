package work02;

public class Homework04 {
    public static void main(String[] args) {
        // 1 4 9 16 25 36 49 64 81 100
        // -3-5-7-9-11-13-15-17-19
        // i = 2i + 1
        //解法一
        int odd ;
        int sum = 1;
        for (int i = 1; i <= 10 ; i++) {
            odd = 2 * i + 1 ;
            System.out.print(sum + "\t");
            sum += odd;
        }
        System.out.println("\n -----------------------------------");
        pow();
    }
    //解法二
    public static void pow() {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print((int) Math.pow(i, 2) + "\t");
        }
    }
}
