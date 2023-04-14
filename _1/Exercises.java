package Esercizi_OOP_Advanced._1;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");

        Dog Boss = new Dog("Boss",1.05,55,"Leonberger");

    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Bird Albatross = new Bird("Albatross",0.3,2.4,0.5);
        Fish Tuna= new Fish("Tuna",0.8,5.6,"Scombidrae");
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");

        Dog Boss = new Dog("Boss",1.05,55,"Leonberger");
        Bird Albatross = new Bird("Albatross",0.3,2.4,0.5);
        Fish Tuna= new Fish("Tuna",0.8,5.6,"Scombidrae");

        Map<Animal,Double>speed=new HashMap<>();
        speed.put(Boss,Boss.runSpeedMetersPerSecond());
        speed.put(Albatross,Albatross.flySpeedMetersPerSecond());
        speed.put(Tuna,Tuna.swimSpeedMetersPerSecond());

        Map.Entry<Animal, Double> maxSpeed = null;

        for(Map.Entry<Animal,Double>animal: speed.entrySet()){

            if (maxSpeed==null||animal.getValue()> maxSpeed.getValue()){

                maxSpeed=animal;

            }

        }

        System.out.println("Il più veloce è: "+maxSpeed.getKey().getName()+" con una velocità di: "+maxSpeed.getValue()+"m/s");


    }
}
