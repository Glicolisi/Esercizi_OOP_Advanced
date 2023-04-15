package Esercizi_OOP_Advanced._2;

public class Car implements Movable {
    @Override
    public Void moveForward() {
        System.out.println("Il mezzo è andato avanti");
        return null;
    }

    @Override
    public Void moveBackward() {
        System.out.println("Il mezzo è andato indietro");
        return null;
    }
}
