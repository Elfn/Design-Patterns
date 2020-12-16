/**
 * Created by Elimane on Dec, 2020, at 23:08
 */

import classes.CPU;
import classes.ComputerFacade;
import classes.HardDrive;
import classes.Memory;

/**
* @Facade provides a unified class
* to a set of classes in a subsystem.
* Its defines a higher level interface
* that make the subsystem easier to use.
* */
public class Test {

  public static void main(String[] args) {

    CPU cpu = new CPU();
    Memory ram = new Memory();
    HardDrive hd = new HardDrive();

    ComputerFacade facade = new ComputerFacade(cpu,ram,hd);
    facade.start();

  }

}
