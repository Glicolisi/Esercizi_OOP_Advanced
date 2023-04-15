package Esercizi_OOP_Advanced._2;

public class Piano extends Instrument{
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public Void play() {

        System.out.println("I play Fur Elisa");
        return null;
    }
}
