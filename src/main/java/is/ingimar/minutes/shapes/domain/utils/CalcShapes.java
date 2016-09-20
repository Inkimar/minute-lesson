package is.ingimar.minutes.shapes.domain.utils;

import is.ingimar.minutes.shapes.domain.Shape;
import java.util.List;

/**
 * Created by root on 9/18/16.
 */
public class CalcShapes {

    public static double getSumOfAreas(List<Shape> shapes) {
        double sum = 0;
        for (Shape shape:shapes){
            sum = sum+shape.getArea();
        }

        return sum;
    }
}
