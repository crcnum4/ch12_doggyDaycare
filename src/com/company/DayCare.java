package com.company;

import java.util.ArrayList;
import java.util.List;

public class DayCare {

    List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println(
                        dog.name + " is a " + dog.size + " " + dog.breed + ", with " + dog.legs + " legs."
                );
            } else if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                System.out.println(
                        cat.name + " is a " + cat.size + " cat with a " + cat.pattern + " fur pattern with a kill count of " + cat.killCount + "."
                );
            } else {
                System.out.println(
                        animal.name + " has " + animal.legs + " legs, and weighs " + animal.weight + " lbs."
                );
            }
            animal.speak();
        }
    }

    public void removeAnimal(String name) {
        //oneliner removeIf method -> removes all occurances.
        animals.removeIf(animal -> animal.name.equals(name));


        // for in method - can only remove the first occurance.
//        for (Animal animal : animals) {
//            if (animal.name.equals(name)) {
//                animals.remove(animal);
//                return;
//            }
//        }
        // for loop method -> can remove first instance or all instances.
//        for (int i = 0; i < animals.size(); i++) {
//            if (animals.get(i).name.equals(name)) {
//                animals.remove(i--);
//            }
//        }

    }
}
