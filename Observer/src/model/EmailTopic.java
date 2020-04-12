package model;

import interfaces.Observer;
import interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by Elimane on Apr, 2020, at 23:04
 */
public class EmailTopic implements Subject {

    //Allowing to be mapped with observer list
    // in order to broadcast a message to observers
    private ArrayList<Observer> observers;
    private String message;//Message to broadcast

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    //Allowing to insert observers into the list of observers
    //To take in account for message's broadcasting
    @Override
    public void register(Observer observer) {
      if(observer == null) throw new NullPointerException("Null object/Observer");
      if(!observers.contains(observer))
          observers.add(observer);

    }

    //Remove one observer from the list
    @Override
    public void unRegister(Observer observer) {
            observers.remove(observer);
    }

    //BroadCast a message to each observer of the list
    // via "update()" method
    @Override
    public void notifyObservers() {
        for(Observer obs : observers)
        {
            obs.update();
        }
    }

    //Used in update() method to notify observers
    @Override
    public Object getUpdate(Observer observer) {
       return this.message;
    }

    //Use notifyObservers() method for
    //broadcast
    public void postMessage(String msg)
    {
        System.out.println("Message posted to my topic : "+msg);
        this.message = msg;
        notifyObservers();
    }
}
