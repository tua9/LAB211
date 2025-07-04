
package com.mycompany.week08;

/*
    Note: 
 */
public abstract class TwoDimensionalShape implements Shape{
        
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ " --> Area = " + getArea();
    }
}
