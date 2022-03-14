package com.archasmiel.learning.lecture19_20;

public class Main {

    public static void main(String[] args)
    {

        for (int i = 0 ; i < 10 ; i++)
        {
            if (i == 4)
                continue;

            System.out.println(i);
        }

        for (int i = 10 ; i > 0 ; i--)
        {

            if (i == 9)
                break;

            System.out.println(i);
        }

    }

}
