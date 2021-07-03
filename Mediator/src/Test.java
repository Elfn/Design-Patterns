import implementations.ATCMediatorImpl;
import implementations.AirCraftImpl;
import interfaces.ATCMediator;
import interfaces.AirCraft;

/**
* Intent: Reduce the complexity and dependencies between tightly coupled
* objects communicating directly with one another, by centralizing complex
* communication and control between related objects
* */
public class Test {
  public static void main(String[] args) {

    ATCMediator mediator = new ATCMediatorImpl();

    //Create some aircrafts
    AirCraft ac1 = new AirCraftImpl(mediator, "Boing1");
    AirCraft ac2 = new AirCraftImpl(mediator, "Helicopter");
    AirCraft ac3 = new AirCraftImpl(mediator, "Boing777");
    AirCraft ac4 = new AirCraftImpl(mediator, "Boing666");

    //Add aircfraft to mediator
    mediator.addAirCraft(ac1);
    mediator.addAirCraft(ac2);
    mediator.addAirCraft(ac3);
   // mediator.addAirCraft(ac4);

    //Send a message to others aircrafts
    //ac1.send("Hello from Boing1");
    ac2.send("Hello from Boing666");

  }
}
