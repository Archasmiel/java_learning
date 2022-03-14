package com.archasmiel.learning.lecture21_22;

public class Main {

    public static void main(String[] args) {

        String student1 = "john@gmail.com";
        String student2 = "july@gmail.com";
        String student3 = "ryan@gmail.com";

        String[] mails = {student1, student2, student3};

        int[] numbers = new int[5];

        System.out.println(mails[0]);

        for (int i = 0 ; i < mails.length ; i++)
        {
            System.out.println(mails[i]);
        }

        // MD arrays

        int[][] some_numbers = { {10, 15, 20, 25}, {50, 500, 5000} };

        for (int i = 0 ; i < some_numbers.length ; i++)
        {
            for (int j = 0; j < some_numbers[i].length ; j++)
            {
                System.out.print(some_numbers[i][j] + " ");
            }
            System.out.println();
        }
    }

}
