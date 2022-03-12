package com.archasmiel.learning.lecture12;

public class Main {

    public static void main(String[] args) {

        String sent = "sTrIng is string";

        System.out.println("Length is: " + sent.length());

        System.out.println("shouting: " + sent.toUpperCase());
        System.out.println("whispering: " + sent.toLowerCase());
        System.out.println(sent);

        System.out.println("index of 'string' sub: " + sent.indexOf("string"));

        System.out.println(sent.replace("string", "str"));

        String s = "";
        boolean b = s.isEmpty();
        System.out.println(b);

        System.out.println(sent.startsWith("s"));
        System.out.println(sent.endsWith("g"));

        System.out.println(sent.contains("sTrING"));

        System.out.println(sent.charAt(10));

        s = sent.substring(12, sent.length());
        System.out.println(s);

        System.out.println(sent.trim());
    }

}
