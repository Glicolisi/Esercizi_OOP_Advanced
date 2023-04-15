package Esercizi_OOP_Advanced._2;

public class Rectangle extends GeometricalShape {
    public Rectangle(Double height, Double width) {
        super(height, width);
    }
    @Override
    public Double calculateArea(){

        return Math.round(getHeight()*getWidth()*100.0)/100.0;

    }
}
