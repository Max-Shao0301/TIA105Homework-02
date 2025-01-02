package workext.homework01;

public class Homework01 {
    public static void main(String[] args) {
        Pen[] pens = new Pen[2];
        pens[0] = new Pencil("SKB", 100);
        pens[1] = new InkBrush("UB", 100);
        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].write());
            System.out.println(pens[i].getPrice());
        }
    }
}

abstract class Pen {
    private String brand;
    private double price;

    public Pen() {
    }
    public Pen(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract String write();
}