package com.archasmiel.learning.lecture15;

public class Main {

    public static void main(String[] args) {

        int x = 100;
        int y = 1000;
        boolean is = true;

        if (x > y)
        {
            // if true
            System.out.println("x > y");
        }
        else
        {
            // if false
            System.out.println("x <= y");
        }

        if (is)
            System.out.println("Yes, is");

        if (is == true)
            System.out.println("Useless code");

        if (x < 50)
            System.out.println("x < 50");
        else if (x >= 50 && x < 100)
            System.out.println("100 > x >= 50");
    }

}
