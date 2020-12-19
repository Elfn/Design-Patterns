package models;

/**
 * Created by Elimane on Dec, 2020, at 00:15
 */
public class Volt {

  private int volts;

  public Volt(int volts) {
    this.volts = volts;
//    String voltage = (this.volts <=  1) ? " volt" : " volts";
//    System.out.println("You choosed " + this.volts + voltage);
  }

  public int getVolts() {
    return volts;
  }

  public void setVolts(int volts) {
    this.volts = volts;
  }
}
