package com.archasmiel.learning.lecture36;

import com.archasmiel.learning.lecture35.Animal;

public class Cat extends Animal
{
    public Cat()
    {
        this.species = "Cat";
    }

    public void meow()
    {
        System.out.println("Meow.");
    }

    @Override
    public void eat() {
        System.out.println(this.species + " is drinking some Milk.");;
    }
}
