package ua.kh.repka;

import java.util.*;

/**
 * main app
 */
public class App {
    private static Random random = new Random();

    public static void main(String[] args) {
        ArrayList<Figure> figureArrayList = new ArrayList<>();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please input number of figures");
//        int figuresQuantity = scanner.nextInt();
//        for (int i = 0; i < figuresQuantity; i++) {
//            figureArrayList.add(getRandFigure());
//        }
        for (int i = 0; i < getRandInt(1, 20); i++) {
            figureArrayList.add(getRandFigure());
        }
        for (Figure figure : figureArrayList) {
            System.out.println(figure);
        }
        for (Figure figure : figureArrayList) {
            figure.draw();
        }
    }

    /**
     * Generating random int number from min to max inclusive
     * @param min minimal int number
     * @param max maximal int number
     * @return int number
     */

    private static int getRandInt(int min, int max) {
        return random.nextInt((max - min) + 1) + min;
    }

    /**
     * Getting random color from Enum
     * @return String color
     */
    private static String getRandColor() {
        List<Color> colorList = Arrays.asList(Color.values());
        return colorList.get(getRandInt(0, colorList.size() - 1)).toString();
    }

    /**
     * Generating random figure
     * @return Figure figure
     */
    private static Figure getRandFigure() {
        switch (getRandInt(1, 4)) {
            case 1:
                return new Square("Square", getRandColor(), getRandInt(10, 50));
            case 2:
                return new Triangle("Triangle", getRandColor(), getRandInt(10, 50), getRandInt(10, 50));
            case 3:
                return new Circle("Circle", getRandColor(), getRandInt(10, 50));
        }
        return new Trapeze("Trapeze", getRandColor(), getRandInt(10, 50), getRandInt(10, 50), getRandInt(10, 50), getRandInt(10, 50));
    }
}
