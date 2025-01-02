package workext.homework02;

public class RoleGameTest {

    public static void main(String[] args) {
        Hero saber = new SwordMan("亞拉岡", 1, 0);
        Hero archer = new ArrowMan("勒苟拉斯", 1, 0);
        Hero hero = new Hero();

        saber.attack();
        saber.move();
        saber.defend();
        saber.drink();
        saber.goHome();

        archer.attack();
        archer.move();
        archer.defend();
        archer.drink();
        archer.goHome();

        hero.attack();
        hero.move();
        hero.defend();
        hero.drink();
        hero.goHome();
    }

}
