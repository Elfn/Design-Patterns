package models;

import interfaces.Command;

/**
 * Created by Elimane on Dec, 2020, at 18:07
 */
//INVOKER
public class GameBoy {

  private Command commandUp;
  private Command commandDown;
  private Command commandLeft;
  private Command commandRight;

  public GameBoy(Command commandUp, Command commandDown, Command commandLeft, Command commandRight) {
    this.commandUp = commandUp;
    this.commandDown = commandDown;
    this.commandLeft = commandLeft;
    this.commandRight = commandRight;
  }

  public void up()
  {
    this.commandUp.execute();
  }

  public void down()
  {
    this.commandDown.execute();
  }

  public void left()
  {
    this.commandLeft.execute();
  }

  public void right()
  {
    this.commandRight.execute();
  }
}
