package work04;

public class Homework03 {
    public static void main(String[] args) {
        new charCheck().check();
    }
}

class charCheck {
    public void check() {
        String[] planets = {"mercury", "venus", "earth", "mars",
                "jupiter", "saturn", "uranus", "neptune"};
        int count = 0;
        for (int i = 0; i < planets.length; i++) { //循環陣列
            for (int j = 0; j < planets[i].length(); j++) { //循環陣列中的字元
                if (planets[i].charAt(j) == 'a' || planets[i].charAt(j) == 'e' ||
                        planets[i].charAt(j) == 'i' || planets[i].charAt(j) == 'o' ||
                        planets[i].charAt(j) == 'u') {
                    count++;
                }
            }
        }
        System.out.println("總共有： " + count + " 個母音");
    }
}