package com.teachmeskills.lesson9_hw.task_1.runner;

import com.teachmeskills.lesson9_hw.task_1.figure.*;

/**
 * This class of execution
 */

public class Runner {
    public static void main(String[] args) {

        Figure[] arr = createArraysFigure();

        for (Figure figure : arr) {
            System.out.println("Название: " + figure.name + ", периметр: " + figure.getFigurePerimeter() + ", площадь: " + figure.getFigureArea());
        }

        double sumFigureArea = 0;

        for (Figure figure : arr) {
            sumFigureArea += figure.getFigureArea();
        }
        System.out.println("Площать всех фигур: " + sumFigureArea);

    }

    private static Figure[] createArraysFigure() {
        Figure triangle1 = new Triangle("Triangle_1", 2.5, 3, 5.3);
        Figure rectangle1 = new Rectangle("Rectangle_1", 6.1, 5);
        Figure rectangle2 = new Rectangle("Rectangle_2", 10.2, 9);
        Figure circle1 = new Circle("Circle_1", 8);
        Figure circle2 = new Circle("Circle_2", 10.5);

        Figure[] arr = {triangle1, rectangle1, rectangle2, circle1, circle2};

        return arr;
    }
}
