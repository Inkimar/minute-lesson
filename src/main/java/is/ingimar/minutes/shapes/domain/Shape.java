package is.ingimar.minutes.shapes.domain;

import java.util.List;

public abstract class Shape {

    private String myId;

    public Shape() {
        this("super shape"); // this is the defaultid of every shape
    }

    
    public Shape(String id) {
        this.myId=id;
    }
    
    public String getMyId(){
        return myId;
    }

    public abstract double getArea();
    //public abstract double getCircumference();

    public static void printArea(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.format("The %s -calculates to the area of %.2f%n",
                    shape, shape.getArea());
        }
    }

    public static double getSumOfAreas(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum = sum + shape.getArea();
        }
        return sum;
    }

    /**
     * @TODO if it is the same shape ( for instance Rectangle ) than then the
     * outcome will be a nonsense like 'Rectangle ... is greater than Rectangle'
     * ....
     *
     * @param shape
     * @return  
     *
     */
    public final int compareArea(Shape shape) {
        if (this.getArea() > shape.getArea()) {
            return 1;
        }
        if (this.getArea() < shape.getArea()) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
