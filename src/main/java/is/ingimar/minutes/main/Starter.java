package is.ingimar.minutes.main;

import is.ingimar.minutes.shapes.domain.Circle;
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
        Shape rec2 = new Rectangle(2.0, 3.0);    
        Shape circ1 = new Circle(10);

        // En lista som bara kan innehålla objekt av typen 'Shape'
        List<Shape> shapes = new ArrayList<>(); 
        shapes.add(rec1);
        shapes.add(rec2);
        shapes.add(circ1);

        Shape.printArea(shapes);
        
        for (Shape shape: shapes){
            System.out.println("name of shape "+shape.getMyId());
        }

        double sumOfAreas = Shape.getSumOfAreas(shapes);
        System.out.format("Sum of the %d areas is %.2f%n",shapes.size(), sumOfAreas);
        
        System.out.println("Which area is greater ?? ");
        switch (circ1.compareArea(circ1)) {
            case 1:
                System.out.println("rec1 is greater than circ1");
                break;
            case -1:
                System.out.println("circ1 is greater than rec1");
                break;
            default:
                System.out.println("they are equal");
                break;
        }

    }
}
