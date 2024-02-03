package com.teachmeskills.lesson9_hw.task_1.figure;

/**
 This class implements the function of calculating area and calculating perimeter for a circle
 */

public class Circle extends Figure{
    final double PI = 3.14;

    double radius;

    public Circle(String name,double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getFigureArea() {
        double figureArea = PI * (radius * radius);
        return figureArea;
    }

    @Override
    public double getFigurePerimeter() {
        double figurePerimeter = 2 * PI * radius;
        return figurePerimeter;
    }
}
