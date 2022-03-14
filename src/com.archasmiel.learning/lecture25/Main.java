package com.archasmiel.learning.lecture25;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> mails = new ArrayList<>();

        mails.add("john@gmail.com");
        mails.add("joe@gmail.com");
        mails.add("jonny@gmail.com");
        mails.add("july@gmail.com");

        String[] names = {"Johnny", "Martin", "George"};

        for (int i = 0 ; i < names.length ; i++)
        {
            System.out.println(names[i]);
        }

        for (String i: names)
        {
            System.out.println(i);
        }
    }

}
