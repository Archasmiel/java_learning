package com.archasmiel.learning.lecture24;

import java.util.HashMap;

public class Main
{

    public static void main(String[] args)
    {

        HashMap<String, String> caps = new HashMap<>();

        caps.put("Mexico", "Mexico");
        caps.put("Germany", "Berlin");
        caps.put("France", "Paris");
        caps.put("USA", "Washington DC");

        System.out.println(caps);

        System.out.println(caps.get("Germany"));

        caps.remove("France");

        System.out.println(caps.size());

        for (String s: caps.keySet())
        {
            System.out.println(s + ": " + caps.get(s));
        }

    }

}
