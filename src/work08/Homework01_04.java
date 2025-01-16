package work08;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Homework01_04 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Integer(100));
        list.add(new Double(3.14));
        list.add(new Long(21L));
        list.add(new Short(String.valueOf(100)));
        list.add(new Double(5.1));
        list.add("Kitty");
        list.add(new Integer(100));
        list.add(new Object());
        list.add("Snoopy");
        list.add(new BigInteger("1000"));

        System.out.println("-----Iterator-----");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----for-----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("-----ForEach-----");
        for (Object all : list ) {
            System.out.println(all);
        }
        System.out.println("--------------------");
        Iterator iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            if (!(next instanceof Number)) {
                iterator1.remove();
            }
        }
        for (Object num : list) {
            System.out.println(num);
        }

// 用for迴圈Snoopy沒有被移除掉？
//        for (int i = 0; i < list.size(); i++) {
//            if (!(list.get(i) instanceof Number)) {
//                list.remove(i);
//            }
//        }
//        for (Object num : list ) {
//            System.out.println(num);
//        }
    }
}
