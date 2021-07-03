package implementations;

import interfaces.ATCMediator;
import interfaces.AirCraft;

import java.util.ArrayList;
import java.util.List;

public class ATCMediatorImpl implements ATCMediator {
  private static List<AirCraft> airCraftList;

  public ATCMediatorImpl() {
    this.airCraftList = new ArrayList<>();
  }

  public static List<AirCraft> getAirCraftList() {
    return airCraftList;
  }

  @Override
  public void sendMessage(String msg, AirCraft airCraft) {
        for (AirCraft ac : airCraftList){
          //Message should not be receive by the aircraft sending the message
          if(ac != airCraft){
            ac.receive(msg);
          }
        }
  }

  @Override
  public void addAirCraft(AirCraft airCraft) {
    airCraftList.add(airCraft);
  }
}
