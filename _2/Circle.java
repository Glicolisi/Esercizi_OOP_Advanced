package Esercizi_OOP_Advanced._2;

import java.util.Objects;

public class Circle extends GeometricalShape {
    public Circle(Double height, Double width) {
        super(height, width);
        if (!(Objects.equals(height, width))){

           width=height;

        }
    }

    @Override
    public Double calculateArea() {
        return (Math.round (Math.PI * Math.pow((getHeight() / 2), 2)*100.0))/100.0;
    }
}
