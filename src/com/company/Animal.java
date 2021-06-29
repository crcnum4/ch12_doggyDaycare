package com.company;

public class Animal {
    public int legs;
    public String size;
    public boolean isFixed;
    public String name;
    public double weight;

    public Animal(int legs, String size, boolean isFixed, String name, double weight) {
        this.legs = legs;
        this.size = size;
        this.name = name;
        this.isFixed = isFixed;
        this.weight = weight;
    }

    public void speak() {
        System.out.println("---");
    }
}
