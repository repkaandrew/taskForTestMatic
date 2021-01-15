package ua.kh.repka;

/**
 * Класс описывает квадрат
 */

public class Square extends Figure {

    private int sideLength;

    public Square(String name, String color, int sideLingt) {
        super(name, color);
        this.sideLength = sideLingt;
    }

    @Override
    public Double getSquare() {
        return Math.pow(this.sideLength, 2);
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public double getDiag(){
        return Math.sqrt(2*Math.pow(this.sideLength, 2));
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }

    @Override
    public String toString() {
        return  "'{' name = " + name + '\'' +
                ", sideLength = " + sideLength + " mm " +
                ", square = " + this.getSquare() + " mm2 " +
                ", color = " + color + '\'' +
                '}';
    }
}
