package is.ingimar.minutes.vehicles;

/**
 * Created by root on 9/18/16.
 */
public abstract class Vehicle {

    private Direction direction;
    private int distance;

    public Vehicle(){
        direction = Direction.NORTH;
    }

    public void drive(){

    }

    public int getMilage(){
        return distance;
    }

    public abstract void sound();

    public Direction getDirection(){
        return direction;
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName();
    }

}
