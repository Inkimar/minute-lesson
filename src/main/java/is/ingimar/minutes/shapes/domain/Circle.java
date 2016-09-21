package is.ingimar.minutes.shapes.domain;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        // no call to super, I do not override name ....
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}
