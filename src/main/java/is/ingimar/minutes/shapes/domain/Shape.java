package is.ingimar.minutes.shapes.domain;

import java.util.List;

/**
 * Created by root on 9/17/16.
 */
public abstract class Shape {

    public abstract double getArea();
    //public abstract double getCircumference();

    public static void print(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.format("The %s -calculates to the area of %.2f%n",
                    shape, shape.getArea());
        }
    }

    /**
     * @TODO
     * if it is the same shape ( for instance Rectangle ) than 
     * then the outcome will be a nonsense like 'Rectangle ... is greater than Rectangle' ....
     * 
     * @param shape
     * @return  
     **/
    public final String compareArea(Shape shape) {
        if (this.getArea() > shape.getArea()) {
            return this + " area is greater than " + shape + " area";
        }
        if (this.getArea() < shape.getArea()) {
            return shape + " area is greater than the " + this + " area";
        }
        return "same area";
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
