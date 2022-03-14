package com.archasmiel.learning.lecture35;

public class Main {

    public static void main(String[] args) {
        Dog fluffy = new Dog();
        fluffy.run();
        fluffy.eat();

        fluffy.bark();

        Cat whiskers = new Cat();
        whiskers.run();
        whiskers.eat();

        whiskers.meow();

        Animal a = new Cat();
        a.run();
        a.eat();

        // Animal ani = new Animal();

        ((Cat)a).meow();
    }


}