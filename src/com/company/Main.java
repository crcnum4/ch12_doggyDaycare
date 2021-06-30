package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        Animal frog = new Animal(4, "small", false, "Raul", 2.0);
//        Cat cat = new Cat(
//                4,
//                "Extra Large",
//                true,
//                "Henry",
//                12.0,
//                "Calico",
//                true,
//                10
//        );
//        Dog dog = new Dog(
//                2,
//                "Medium",
//                true,
//                "Benji",
//                27.7,
//                "Bulldog",
//                "short",
//                "B34"
//        );
//
//        frog.speak();
//        cat.speak();
//        dog.speak();

//        List<Animal> animals = new ArrayList<>();
        DayCare doggyDayCare = new DayCare();
        DayCare careerDogs = new DayCare();

        doggyDayCare.addAnimal(
                new Animal(4, "small", false, "Raul", 2.0)
        );
        careerDogs.addAnimal(
                new Cat(
                    4,
                    "Extra Large",
                    true,
                    "Henry",
                    12.0,
                    "Calico",
                    true,
                    10
                )
        );
        doggyDayCare.addAnimal(
                new Dog(
                        2,
                        "Medium",
                        true,
                        "Benji",
                        27.7,
                        "Bulldog",
                        "short",
                        "B34"
                )
        );
        careerDogs.addAnimal(
                new Dog(
                        4,
                        "Extra Medium",
                        false,
                        "Spike",
                        30.0,
                        "Husky",
                        "Long",
                        "N7",
                        "Yip"
                )
        );

        doggyDayCare.displayAnimals();
        System.out.println("");
        careerDogs.displayAnimals();
//        doggyDayCare.removeAnimal("Benji");
//        doggyDayCare.displayAnimals();
    }
}
