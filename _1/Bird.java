package Esercizi_OOP_Advanced._1;

public class Bird extends Animal{

    private Double wingSpan;

    public Bird(String name, double height, double weight, Double wingSpan) {
        super(name, height, weight);
        this.wingSpan = wingSpan;
    }

    public Double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(Double wingSpan) {
        this.wingSpan = wingSpan;
    }

    public Double flySpeedMetersPerSecond(){

        return getWingSpan()*4;

    }



}
