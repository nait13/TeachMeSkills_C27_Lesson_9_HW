package com.teachmeskills.lesson9_hw.task_1.figure;

/**
 This class implements the function of calculating area and calculating perimeter for a rectangle
 */

public class Rectangle extends Figure {
    double rectangleSides_A;

    double rectangleSides_B;

    public Rectangle(String name, double rectangleSides_A, double rectangleSides_B) {
        super(name);
        this.rectangleSides_A = rectangleSides_A;
        this.rectangleSides_B = rectangleSides_B;
    }

    @Override
    public double getFigureArea() {
        double s = rectangleSides_A * rectangleSides_B;
        return s;
    }

    @Override
    public double getFigurePerimeter() {
        double p = 2 * (rectangleSides_A * rectangleSides_B);
        return p;
    }

}
