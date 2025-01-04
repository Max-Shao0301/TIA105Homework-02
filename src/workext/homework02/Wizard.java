package workext.homework02;

public class Wizard extends Hero{
    public Wizard(String name, int level, double exp) {
        super(name, level, exp);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " 使用火球");
    }

    @Override
    public void defend() {
        System.out.println(getName() + " 冰盾防禦");
    }

    @Override
    public void move() {
        System.out.println(getName() + " 瞬間移動");
    }
}
