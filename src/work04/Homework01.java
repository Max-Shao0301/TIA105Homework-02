package work04;

public class Homework01 {
    public static void main(String[] args) {
        new ArrayMath().arrMath();
    }
}

class ArrayMath {
    public void arrMath() {
        int [] array = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
        int sum = 0;
        int avg ;
        for (int num : array) {
            sum += num;
        }
        avg = sum / array.length;
        System.out.println("平均值: " + avg);
        System.out.print("大於平均值的元素： ");
        for (int num : array) {
            if (num > avg) {
                System.out.print(num + "\t");
            }
        }
    }
}