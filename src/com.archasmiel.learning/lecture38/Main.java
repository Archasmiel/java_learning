package com.archasmiel.learning.lecture38;

public class Main {

    public static void main(String[] args) throws Exception {

        int[] numbers = new int[2];

        // System.out.println(numbers[2]);   outofboundsexception
        System.out.println("Hello World");

        try {
            System.out.println(divide(10, 0));
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static float divide(float a, float b) throws Exception{
        if (b == 0)
            throw new Exception("Divide by zero!");

        return a / b;
    }

}
