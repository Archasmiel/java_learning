package com.archasmiel.learning.lecture23;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> mails = new ArrayList<>();

        mails.add("john@gmail.com");
        mails.add("joe@gmail.com");
        mails.add("jonny@gmail.com");
        mails.add("july@gmail.com");

        System.out.println(mails + " " + mails.size());
        System.out.println(mails.get(0));

        mails.set(0, "john@yahoo.com");

        mails.remove(1);

        System.out.println(mails + " " + mails.size());

        mails.clear();

        System.out.println(mails + " " + mails.size());

        mails.add("some2@");
        mails.add("some1@");
        mails.add("some3@");

        System.out.println(mails + " " + mails.size());

        Collections.sort(mails);

        System.out.println(mails + " " + mails.size());

    }

}
