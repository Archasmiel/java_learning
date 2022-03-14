package com.archasmiel.learning.lecture35;

public abstract class Animal
{

    protected String species;

    public void run(){
        System.out.println(this.species + " is running.");
    }

    public abstract void eat();

}
