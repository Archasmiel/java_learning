package com.archasmiel.learning.lecture33;

public class Main {

    public static void main(String[] args) {
        Animal a = new Animal();
        System.out.println(Animal.numAnimals);

        Animal b = Animal.genAnimal();
        System.out.println(Animal.numAnimals);
    }

}
