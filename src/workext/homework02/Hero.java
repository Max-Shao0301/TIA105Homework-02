package workext.homework02;

public abstract class Hero implements IAttack, IDefend, IDrink, IGoHome, IMove {

    private String name;
    private int level;
    private double exp;


    public Hero(String name, int level, double exp) {
        this.name = name;
        this.level = level;
        this.exp = exp;
    }


    public String getName() {
        return name;
    }


    @Override
    public abstract void defend();

    @Override
    public abstract void attack();

    public abstract void move();

    @Override
    public void drink() {
        System.out.println(getName() + " 喝HP藥水");
    }

    @Override
    public void goHome() {
        System.out.println(getName() + " 回到城鎮");
    }
}
