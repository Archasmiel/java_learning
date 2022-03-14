package com.archasmiel.learning.lecture28_30;

public class Main {

    public static void main(String[] args) {

        /* CLASSES AND OBJECTS */
        // int x;
        Fruit banana = new Fruit("banana", 15, "yellow");

        banana.setName("banana");
        banana.setSugarContent(15);
        banana.setColor("yellow");

        System.out.println(banana);

        Fruit apple = new Fruit("apple", 10, "red");
        System.out.println(apple);

        Fruit nothing = new Fruit();
        System.out.println(nothing);
    }

}
