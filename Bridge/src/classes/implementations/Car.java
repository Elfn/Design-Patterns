package classes.implementations;

import classes.abstractions.Vehicle;
import classes.abstractions.Workshop;

/**
 * Created by Elimane on Dec, 2020, at 00:39
 */
public class Car extends Vehicle {


  public Car(Workshop workshop, Workshop workshop2) {
    super(workshop, workshop2);
  }

  @Override
  public void manufacture() {
    System.out.print("Car..");
    workshop.make();
    workshop2.make();
  }
}
