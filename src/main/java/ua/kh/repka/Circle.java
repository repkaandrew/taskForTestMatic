package ua.kh.repka;

/**
 * Класс описывает круг
 */

public class Circle extends Figure {

    private int diameter;
    private Double circleLength;

    public Circle(String name, String color, int diameter) {
        super(name, color);
        this.diameter = diameter;
        this.circleLength = Math.PI*diameter;
    }

    public Double getCircleLen (){
        return circleLength;
    }

    @Override
    public Double getSquare() {
        return Math.PI*Math.pow(diameter, 2)/4;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    public String toString() {
        return "'{' name = " + name + '\'' +
                ", diameter = " + diameter + " mm " +
                ", length = " + circleLength + '\'' + " mm " +
                ", square = " + this.getSquare() + " mm2 " +
                ", color = " + color + '\'' +
                '}';
    }
}
