package is.ingimar.minutes.main;

import is.ingimar.minutes.shapes.domain.Circle;
import is.ingimar.minutes.shapes.domain.utils.CalcShapes;
import is.ingimar.minutes.shapes.domain.Rectangle;
import is.ingimar.minutes.shapes.domain.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Starter {

    public static void main(String[] args) {
        Shape rec1 = new Rectangle(4.0, 10.0);
        double rec1Area = rec1.getArea();
        System.out.printf("Rectangle 1 area is %.2f and ", rec1Area);
        Shape rec2 = new Rectangle(2.0, 3.0);
        double rec2Area = rec2.getArea();
        System.out.printf("Rectangle 2 area is %.2f and ", rec2Area);
     
        Shape circ1 = new Circle(10);
        double circ1Area = circ1.getArea();
        System.out.printf("Circle 2 area is %.2f \n", circ1Area);

        // En lista som bara kan innehålla objekt av typen 'Shape'
        List<Shape> shapes = new ArrayList<>(); 
        shapes.add(rec1);
        shapes.add(rec2);
        shapes.add(circ1);
        

        Shape.print(shapes);

        double sumOfAreas = CalcShapes.getSumOfAreas(shapes);
        System.out.println("Sum of areas is " + sumOfAreas);
        
        String larger = rec1.compareArea(rec2);
        System.out.println(""+larger);
    }
}
