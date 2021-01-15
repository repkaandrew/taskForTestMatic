package ua.kh.repka;

public abstract class Figure implements drawAble {
    public String name;
    public String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return this.name;
    }

    public abstract Double getSquare();

    public String getColor() {
        return color;
    }
}
