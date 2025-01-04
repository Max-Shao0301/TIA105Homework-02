package workext.homework02;

public class RoleGameTest {

    public static void main(String[] args) {
        Hero[] heros = new Hero[3];
        heros[0] = new ArrowMan("俠盜", 1, 90);
        heros[1] = new SwordMan("野蠻人", 20, 88);
        heros[2] = new Wizard("巫師", 99, 20);
        for (Hero hero : heros) {
            hero.attack();
            hero.defend();
            hero.move();
            hero.drink();
            hero.goHome();
            if (hero instanceof SwordMan) {
                ((SwordMan) hero).bigTrick();
            }
        }


    }

}
