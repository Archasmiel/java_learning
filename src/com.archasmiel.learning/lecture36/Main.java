package com.archasmiel.learning.lecture36;

public class Main {

    public static void main(String[] args) {
        Dog fluffy = new Dog();
        fluffy.Talk();

        ITalkable fluff = new Dog();
        fluff.Talk();
    }

}
