package com.archasmiel.learning.lecture11;

public class Main {

    public static void main(String[] args) {

        // comparison
        boolean grounded = false;
        boolean x = 2 < 5;   // true
        boolean y = 10 > 50; // false

        // < > >= <= ==
        boolean b = 100 == 100; // true - equals
        boolean c = 50 != 51; // true - unequals

        // and(&&) or(||) not(!)
        boolean b2 = x && y;
        boolean b3 = grounded || b;
        boolean b4 = !c;

        boolean b5 = b2 && b4 || b3 && x || y || c;

    }

}
