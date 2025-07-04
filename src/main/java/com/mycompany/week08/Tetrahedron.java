
package com.mycompany.week08;

/*
    Note: 
 */

class Tetrahedron extends ThreeDimensionalShape {
    private final double edge;

    public Tetrahedron(double edge) {
        this.edge = edge;
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) * edge * edge;
    }

    @Override
    public double getVolume() {
        return (1.0 / 12.0) * Math.sqrt(2) * edge * edge * edge;
    }
}
