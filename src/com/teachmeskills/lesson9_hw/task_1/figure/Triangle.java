package com.teachmeskills.lesson9_hw.task_1.figure;

/**
 This class implements the function of calculating area and calculating perimeter for a triangle
 */

public final class Triangle extends Figure {
    double triangleSides_A;
    double triangleSides_B;
    double triangleSides_C;

    public Triangle(String name, double triangleSides_A, double triangleSides_B, double triangleSides_C) {
        super(name);
        this.triangleSides_A = triangleSides_A;
        this.triangleSides_B = triangleSides_B;
        this.triangleSides_C = triangleSides_C;
    }

    @Override
    public double getFigureArea() {
        double s = 0.5 * (triangleSides_A * triangleSides_B);

        return s;
    }

    @Override
    public double getFigurePerimeter() {
        double p = triangleSides_A + triangleSides_B + triangleSides_C;

        return p;
    }


}
