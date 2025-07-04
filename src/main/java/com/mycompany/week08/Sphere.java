
package com.mycompany.week08;

/*
    Note: 
 */
class Sphere extends ThreeDimensionalShape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}
