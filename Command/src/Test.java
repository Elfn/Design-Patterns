import models.GameBoy;
import models.characters.MarioCharacter;
import models.commands.MarioCommandDown;
import models.commands.MarioCommandUp;

/**
 * Created by Elimane on Dec, 2020, at 18:02
 */
/*
* The command pattern encapsulates a request as an object,
* thereby letting us parameterize other objects with different requests,
* queue or log requests, and support undoable operations.
* */

/* PROS
 * -It decouples the classes that invoke the operation from the object that knows how to execute the operation
 * -It allows you to create a sequence of commands by providing a queue system
 * -Extensions to add a new command is easy and can be done without changing the existing code
 * -You can also define a rollback system with the Command pattern, for example, in the Wizard example, we could write a rollback method
 * */

/* CONS
 * -There are a high number of classes and objects working together to achieve a goal. Application developers need to be careful developing these classes correctly.
 * -Every individual command is a ConcreteCommand ...
 * */

public class Test {

  public static void main(String[] args) {

    //Create receivers
    MarioCharacter mario = new MarioCharacter();
    mario.setName("Mario");

    //Create command
    MarioCommandDown down = new MarioCommandDown(mario);
    MarioCommandUp up = new MarioCommandUp(mario);

    //Invoker
    GameBoy gameBoy = new GameBoy(up,down,null,null);//For instance there is no left and right commands

    gameBoy.up();

  }

}


