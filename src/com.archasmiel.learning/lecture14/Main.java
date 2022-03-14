package com.archasmiel.learning.lecture14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int x = 100;
        int y = 225;

        System.out.println(Math.max(x, y));
        System.out.println(Math.min(x, y));

        System.out.println((int)Math.sqrt(y));

        System.out.println(Math.abs(-5000));

        System.out.println((int)Math.ceil(22.413f));
        System.out.println((int)Math.floor(22.413f));

        System.out.println(Math.pow(10, 2));

        System.out.println(Math.random()*100f - 50f);

        /*
        List<Double> list = new ArrayList<>();
        for (int i = 0 ; i < 100 ; i++){
            list.add(Math.random()*100f - 50f);
        }
        Collections.sort(list);
        System.out.println(list);
        */
    }

}
