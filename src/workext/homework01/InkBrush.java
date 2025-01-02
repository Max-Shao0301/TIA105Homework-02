package workext.homework01;

public class InkBrush extends Pen{
    public InkBrush(String brand, double price) {
        super(brand, price);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 0.9;
    }

    @Override
    public String write() {
        return "沾墨汁再寫";
    }
}
