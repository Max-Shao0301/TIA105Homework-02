package work05;

public class Homework02 {
    public static void main(String[] args) {
        new RandomTest().randAvg();
    }
}

class RandomTest {
    public void randAvg() {
        int sum = 0;
        System.out.println("本次亂數結果：");
        for (int i = 0; i < 10; i++) {
            int randomNum = (int) (Math.random() * 101);
            System.out.print(randomNum + "\t");
            sum += randomNum;
        }
        System.out.println();
        System.out.println("平均:" + sum / 10);
    }
}