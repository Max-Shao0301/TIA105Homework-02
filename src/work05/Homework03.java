package work05;

public class Homework03 {
    public static void main(String[] args) {
        int[][] intArray = {{1, 6, 3}, {9, 5, 2}};
        System.out.println(new TestMax().maxElement(intArray));
        double[][] doubleArray = {{1.2, 3.5, 2.2}, {7.4, 2.1, 8.2}};
        System.out.println(new TestMax().maxElement(doubleArray));

    }
}

class TestMax {
    public int maxElement(int x[][]) {
        int temp = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > temp) {
                    temp = x[i][j];
                }
            }
        }
        return temp;
    }

    public double maxElement(double x[][]) {
        double temp = 0;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x[i][j] > temp) {
                    temp = x[i][j];
                }
            }
        }
        return temp;
    }
}