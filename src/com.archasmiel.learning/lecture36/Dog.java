package com.archasmiel.learning.lecture36;

import com.archasmiel.learning.lecture35.Animal;

public class Dog extends Animal implements ITalkable
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

    @Override
    public void Talk() {
        System.out.println("This dog really likes you.");
    }
}
