package is.ingimar.minutes.shapes.domain;

/**
 * Created by root on 9/17/16.
 */
public class Rectangle extends Shape {

    private final double width;
    private final double height;

    public Rectangle(double width, double height){
        
        super("Rectangle shape"); // overriding the default name in super-class
        this.width=width;
        this.height=height;
    }

    @Override
    public double getArea() {
        double area = width * height;
        return area;
    }
}