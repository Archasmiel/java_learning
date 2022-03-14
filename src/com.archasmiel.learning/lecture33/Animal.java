package com.archasmiel.learning.lecture33;

public class Animal
{

    public String species;
    public static int numAnimals = 0;

    public Animal()
    {
        numAnimals++;
    }

    public static Animal genAnimal()
    {
        return new Animal();
    }

    public void run(){
        System.out.println(this.species + " is running.");
    }

    public void eat(){
        System.out.println(this.species + " is eating.");
    }

}
