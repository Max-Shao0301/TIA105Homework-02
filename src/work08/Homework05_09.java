package work08;

import java.util.*;

public class Homework05_09 {
    public static void main(String[] args) {
        Train train1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
        Train train2 = new Train(1254, "區間", "屏東", "基隆", 700);
        Train train3 = new Train(118, "自強", "高雄", "台北", 500);
        Train train4 = new Train(1288, "區間", "新竹", "基隆", 400);
        Train train5 = new Train(122, "自強", "台中", "花蓮", 600);
        Train train6 = new Train(1222, "區間", "樹林", "七堵", 300);
        Train train7 = new Train(1254, "區間", "屏東", "基隆", 700);
        HashSet<Train> trains = new HashSet<>();
        trains.add(train1);
        trains.add(train2);
        trains.add(train3);
        trains.add(train4);
        trains.add(train5);
        trains.add(train6);
        trains.add(train7);
        System.out.println("-----不列印重複物件------");
        Iterator<Train> iterator = trains.iterator();
        while (iterator.hasNext()) {
            Train train = iterator.next();
            System.out.println(train);
        }
        System.out.println("");
        System.out.println("-----由大到小並且不列印重複物件------");

        TreeSet<Train> trainsSet = new TreeSet<>();
        trainsSet.add(train1);
        trainsSet.add(train2);
        trainsSet.add(train3);
        trainsSet.add(train4);
        trainsSet.add(train5);
        trainsSet.add(train6);
        trainsSet.add(train7);
        for (Train train : trainsSet) {
            System.out.println(train);
        }
    }
}

class Train implements Comparable<Train> {
    private int number;
    private String type;
    private String start;
    private String dest;
    private double price;

    public Train(int number, String type, String start, String dest, double price) {
        this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }

    @Override
    public int compareTo(Train o) {
        if (this.number < o.number) {
            return 1;
        } else if (this.number == o.number) {
            return 0;
        } else {
            return -1;
        }
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Train train = (Train) o;
        return number == train.number && Double.compare(price, train.price) == 0 && Objects.equals(type, train.type) && Objects.equals(start, train.start) && Objects.equals(dest, train.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + number +
                ", type='" + type + '\'' +
                ", start='" + start + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                '}';
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}