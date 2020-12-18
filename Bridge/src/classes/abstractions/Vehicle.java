package classes.abstractions;

/**
 * Created by Elimane on Dec, 2020, at 00:34
 */
public abstract class Vehicle {

  //That 2 lines are making the "bridge"
  //between workshop and vehicle
   protected Workshop workshop;
   protected Workshop workshop2;

  public Vehicle(Workshop workshop, Workshop workshop2) {
    this.workshop = workshop;
    this.workshop2 = workshop2;
  }

  public abstract void manufacture();

}
