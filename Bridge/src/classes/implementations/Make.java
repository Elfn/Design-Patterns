package classes.implementations;

import classes.abstractions.Workshop;

/**
 * Created by Elimane on Dec, 2020, at 00:47
 */
public class Make implements Workshop {
  @Override
  public void make() {
    System.out.print(" making...");
  }
}
