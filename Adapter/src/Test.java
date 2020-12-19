/**
 * Created by Elimane on Dec, 2020, at 22:50
 */

import interfaces.SocketAdapter;
import models.SocketAdapterImpl;
import models.SocketObjectAdapterImpl;
import models.Volt;

/**
*@Adapter pattern works as a bridge between two incompatible interfaces.
* This type of design pattern comes under structural pattern
* as this pattern combines the capability of two independent interfaces.
* */
public class Test {
  public static void main(String[] args) {
    testingObjectAdapter();
    testingAdapter();

  }

  private static void testingObjectAdapter(){
    SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
    Volt v1 = getVolt(socketAdapter,4);

    System.out.println("You choosed "+v1.getVolts()+" volts");
  }

  private static void testingAdapter(){
    SocketAdapter socketAdapter = new SocketAdapterImpl();
    Volt v1 = getVolt(socketAdapter,4);

    System.out.println("You choosed "+v1.getVolts()+" volts");
  }

  private static Volt getVolt(SocketAdapter socketAdapter, int volt)
  {
    return socketAdapter.getVolts(volt);
  }

}
