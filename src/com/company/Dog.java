package com.company;

public class Dog extends Animal {
    public String breed;
    public String snoutLength;
    // chipid, isHouseBroken, isServiceDog, energyLevel,
    public final String chipId;

    public Dog(
            int legs,
            String size,
            boolean isFixed,
            String name,
            double weight,
            String breed,
            String snoutLength,
            String chipId
    ) {
        super(legs, size, isFixed, name, weight);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.chipId = chipId;
    }

    @Override
    public void speak() {
        System.out.println("A-Woof!");
    }
}
