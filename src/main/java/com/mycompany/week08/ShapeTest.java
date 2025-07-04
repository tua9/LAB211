
package com.mycompany.week08;

/*
    Note: 
 */
public class ShapeTest {
    public static void run() {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(4);
        shapes[2] = new Sphere(3);
        shapes[3] = new Tetrahedron(2);

        for (Shape shape : shapes) {
            System.out.println(shape);
            
        }
    }
}
