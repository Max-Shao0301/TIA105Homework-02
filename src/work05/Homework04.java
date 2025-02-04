package work05;

public class Homework04 {
    public static void main(String[] args) {
        MyRectangle myRectangle = new MyRectangle();
        myRectangle.setWidth(10);
        myRectangle.setDepth(20);
        System.out.println(myRectangle.getArea());

        MyRectangle myRectangle1 = new MyRectangle(10, 20);
        System.out.println(myRectangle1.getArea());
    }
}

class MyRectangle {
    private double width;
    private double depth;

    public MyRectangle() {
    }

    public MyRectangle(double width, double depth) {
        this.width = width;
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getArea() {
        return width * depth;
    }
}