package implementations;

import interfaces.ATCMediator;
import interfaces.AirCraft;

import java.util.ArrayList;
import java.util.List;

public class AirCraftImpl extends AirCraft {

  List<AirCraft> airCraftList;


  public AirCraftImpl(ATCMediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void send(String msg) {

      System.out.println(this.name + " : sending message = " + msg);
      mediator.sendMessage(msg, this);

  }

  @Override
  public void receive(String msg) {

      System.out.println(this.name + " : received message = " + msg);


  }
}
