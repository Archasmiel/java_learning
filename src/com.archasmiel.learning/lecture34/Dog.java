package com.archasmiel.learning.lecture34;

public class Dog extends Animal
{
    public Dog()
    {
        this.species = "Dog";
    }

    public void bark()
    {
        System.out.println("Woof woof.");
    }

    @Override
    public void eat()
    {
        System.out.println(this.species + " is eating a Steak.");
    }

}
