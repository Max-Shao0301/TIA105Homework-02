package com.xxx;

public class TestNineNine03 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            int j = 1;
            do {
                System.out.print( i + " * " + j + " = " + (i * j) + "\t");
                j ++;
            } while (j < 10);
            i++ ;
            System.out.println();
        }
    }
}
