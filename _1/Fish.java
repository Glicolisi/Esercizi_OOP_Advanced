package Esercizi_OOP_Advanced._1;

public class Fish extends Animal {
    private String species;

    public Fish(String name, double height, double weight, String species) {
        super(name, height, weight);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Double swimSpeedMetersPerSecond(){

        return getWeight()*2;

    }
}


