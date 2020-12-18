import classes.abstractions.Vehicle;
import classes.abstractions.Workshop;
import classes.implementations.Assemble;
import classes.implementations.Bike;
import classes.implementations.Car;
import classes.implementations.Make;

/**
 * Created by Elimane on Dec, 2020, at 00:26
 */
/*
*
* @Bridge allows us to separate the abstraction
* from the implementation
*
* @Implementations are platform independent
*
* */

public class Test {

  public static void main(String[] args) {

    Workshop workshopA = new Make();
    Workshop workshopB = new Assemble();

    Vehicle bmw = new Car(workshopA,workshopB);
    Vehicle bmx = new Bike(workshopA,workshopB);

    bmw.manufacture();
    bmx.manufacture();

  }

}
