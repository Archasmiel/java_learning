package com.archasmiel.learning.lecture27;

public class Main {

    public static void main(String[] args) {

        System.out.println(mult(12, 5));
        System.out.println(mult(12, 5, 4));
        System.out.println(mult(12.225f, 5.3f));

    }

    public static int mult(int a, int b) {
        return a * b;
    }

    public static int mult(int a, int b, int c) {
        return a * b * c;
    }

    public static float mult(float a, float b) {
        return a * b;
    }

}
