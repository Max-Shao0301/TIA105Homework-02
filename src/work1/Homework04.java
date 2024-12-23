package work1;

public class Homework04 {
    public static void main(String[] args) {
        final double PI = 3.1415;
        double radius = 5, area, circumference;
        area = radius * radius * PI;//圓面積公式
        circumference = radius * 2 * PI;//圓周長公式
        System.out.printf("圓面積：%.2f",area);//用format取小數點後兩位
        System.out.println();
        System.out.printf("圓周長：%.2f", circumference);//用format取小數點後兩位
    }
}
