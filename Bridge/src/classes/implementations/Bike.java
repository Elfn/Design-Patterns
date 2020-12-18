package classes.implementations;

import classes.abstractions.Vehicle;
import classes.abstractions.Workshop;

/**
 * Created by Elimane on Dec, 2020, at 00:42
 */
public class Bike extends Vehicle {

  public Bike(Workshop workshop, Workshop workshop2) {
    super(workshop, workshop2);
  }

  @Override
  public void manufacture() {
    System.out.print("Bike....");
    workshop.make();
    workshop2.make();
  }
}
