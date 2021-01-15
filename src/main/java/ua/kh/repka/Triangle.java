package ua.kh.repka;

/**
 * Класс описывает прямоугольный треугольник
 */

public class Triangle extends Figure {

    private double sideA;
    private double sideB;
    private double hypotinuse;

    Triangle( String name, String color, int sideA, int sideB) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotinuse = Math.sqrt(Math.pow(this.sideA, 2)+ Math.pow(this.sideB, 2));
    }

    @Override
    public Double getSquare() {
        return this.sideA*this.sideB/2;
    }

    public Double getHypotinuse () {
        return this.hypotinuse;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }

    @Override
    public String toString() {
        return "'{' name = " + name + '\'' +
                ", sideA = " + sideA + " mm " +
                ", sideB = " + sideB + " mm " +
                ", hypotinuse = " + hypotinuse + " mm " +'\'' +
                ", square = " + this.getSquare() + " mm2 " +
                ", color = " + color + '\'' +
                '}';
    }
}
