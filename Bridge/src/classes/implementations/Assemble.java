package classes.implementations;

import classes.abstractions.Workshop;

/**
 * Created by Elimane on Dec, 2020, at 00:46
 */
public class Assemble implements Workshop {
  @Override
  public void make() {
    System.out.print("..also");
    System.out.println(" assembled");
  }
}
