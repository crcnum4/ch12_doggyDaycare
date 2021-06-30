package com.company;

public class Dog extends Animal {
    public String breed;
    public String snoutLength;
    // chipid, isHouseBroken, isServiceDog, energyLevel,
    public final String chipId;
    public String noise = "";

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

    public Dog(
            int legs,
            String size,
            boolean isFixed,
            String name,
            double weight,
            String breed,
            String snoutLength,
            String chipId,
            String noise
    ) {
        super(legs, size, isFixed, name, weight);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.chipId = chipId;
        this.noise = noise;
    }

    @Override
    public void speak() {
        if (noise.equals("")) {
            super.speak();
        } else {
            System.out.println(noise);
        }
    }
}
