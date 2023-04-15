package Esercizi_OOP_Advanced._2;

abstract class GeometricalShape {

private Double height;
private Double width;

    public GeometricalShape(Double height, Double width) {
        this.height = height;
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    abstract Double calculateArea();



}
