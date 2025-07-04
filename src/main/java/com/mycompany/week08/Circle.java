
package com.mycompany.week08;

/*
    Note: 
 */
class Circle extends TwoDimensionalShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

