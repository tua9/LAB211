
package com.mycompany.week08;

/*
    Note: 
 */
class Square extends TwoDimensionalShape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}