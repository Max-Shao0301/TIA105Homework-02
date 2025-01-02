package workext.homework01;

public class Pencil extends Pen {
    public Pencil(String brand, double price) {
        super(brand, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }

    @Override
    public String write() {
        return "削鉛筆再寫";
    }
}
