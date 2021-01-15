package ua.kh.repka;
/**
 * Класс описывает трапецию
 */
public class Trapeze extends Figure {
    private int sideDown;
    private int sideUp;
    private int sideLeft;
    private int height;
    private double midleLine;

    public Trapeze(String name, String color, int sideDown, int sideUp, int sideLeft, int height) {
        super(name, color);
        this.sideDown = sideDown;
        this.sideUp = sideUp;
        this.sideLeft = sideLeft;
        this.height = height;
        this.midleLine = ((double)(this.sideDown + this.sideUp))/2;
    }

    public double getMidleLine() {
        return midleLine;
    }

    @Override
    public Double getSquare() {
        return this.midleLine*this.height;
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Trapeze");
    }

    @Override
    public String toString() {
        return "'{' name = " + name + '\'' +
                ", sideDown = " + sideDown + " mm " +
                ", sideUp = " + sideUp + " mm " +
                ", height = " + height + " mm " +
                ", midleLine = " + midleLine + " mm " +
                ", square = " + this.getSquare() + " mm2 " +
                ", color = " + color + '\'' +
                '}';
    }
}
