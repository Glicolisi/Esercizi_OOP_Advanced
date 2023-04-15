package Esercizi_OOP_Advanced._2;

public class Guitar extends  Instrument{

    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public Void play() {

        System.out.println("I play Yellow Submarine");
        return null;
    }
}
