
package com.mycompany.week08;

/*
    Note: 
 */
class Cube extends ThreeDimensionalShape {
    private final double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return 6 * side * side;
    }

    @Override
    public double getVolume() {
        return side * side * side;
    }
}
