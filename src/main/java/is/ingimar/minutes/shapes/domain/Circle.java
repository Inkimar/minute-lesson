package is.ingimar.minutes.shapes.domain;

/**
 * Created by root on 9/17/16.
 */
public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
