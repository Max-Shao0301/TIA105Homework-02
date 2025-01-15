package work07;

import java.io.*;

public class Homework04 {
    public static void main(String[] args) throws IOException {
        String pathDir = "/Users/maxshao/Documents/data";
        String pathName = "/Users/maxshao/Documents/data/Object.ser";
        File file = new File(pathDir);
        if (!file.exists()) {
            file.mkdir();
        }
        File file1 = new File(pathName);
        FileOutputStream fos = new FileOutputStream(file1);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Cat cat01 = new Cat("Li");
        Cat cat02 = new Cat("Wu");
        Dog dog01 = new Dog("Wo");
        Dog dog02 = new Dog("Wow");
        oos.writeObject(cat01);
        oos.writeObject(cat02);
        oos.writeObject(dog01);
        oos.writeObject(dog02);
        oos.close();
        fos.close();
    }
}

class Cat implements Serializable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("This is Cat " + name + " speaking!");
    }

}
class Dog implements Serializable {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("This is Dog " + name + " speaking.");
    }
}