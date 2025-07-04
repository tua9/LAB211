
package com.mycompany.week08;

/*
    Note: 
 */
public abstract class ThreeDimensionalShape implements Shape{
    public abstract double getVolume();

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " --> Area = " + getArea() + ", Volume = " + getVolume();
    }
}
