package com.archasmiel.learning.lecture28_30;

public class Fruit {

    private String name;
    private int sugarContent;
    private String color;

    public Fruit(){

    }

    public Fruit(String name, int sugarContent, String color){
        this.name = name;
        this.sugarContent = sugarContent;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", sugarContent=" + sugarContent +
                ", color='" + color + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSugarContent() {
        return sugarContent;
    }

    public void setSugarContent(int sugarContent) {
        this.sugarContent = sugarContent;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
