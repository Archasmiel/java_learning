package com.archasmiel.learning.lecture26;

public class Main {

    public static int factorial(int number) {
        return (number > 0) ? factorial(number-1) * number : 1;
    }

    public static void main(String[] args) {

        int num, factorial;

        num = 5;
        factorial = num;

        for  (int i = num-1 ; i >= 1 ; i--){
            factorial *= i;
        }

        System.out.println(factorial);

        System.out.println("Factorial is " + factorial(5));
        System.out.println("Factorial is " + factorial(6));
        System.out.println("Factorial is " + factorial(7));

    }

}
