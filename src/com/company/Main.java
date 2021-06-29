package com.company;

public class Main {

    public static void main(String[] args) {
        Animal frog = new Animal(4, "small", false, "Raul", 2.0);
        Cat cat = new Cat(
                4,
                "Extra Large",
                true,
                "Henry",
                12.0,
                "Calico",
                true,
                10
        );
        Dog dog = new Dog(
                2,
                "Medium",
                true,
                "Benji",
                27.7,
                "Bulldog",
                "short",
                "B34"
        );

        frog.speak();
        cat.speak();
        dog.speak();
    }
}
