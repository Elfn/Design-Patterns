package com.company.model;

import com.company.interfaces.Receiver;
import com.company.interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by Elimane on May, 2020, at 11:31
 */
//BROADCASTER
public class Provider implements Subject {

    private ArrayList<Receiver> receivers;
    private Message msg = new Message();

    public Provider() {
        this.receivers = new ArrayList<>();
    }

    @Override
    public void register(Receiver receiver) {
        if(receiver == null) throw new NullPointerException("Null object/Receiver");
        if(!receivers.contains(receiver))
        {
            receivers.add(receiver);

            //Link receiver to provider to make him get provider's messages
            receiver.subscription(this);
        }
    }

    @Override
    public void unRegister(Receiver receiver) {
        receivers.remove(receiver);
    }

    @Override
    public void notifyReceivers() {
        for(Receiver rec : receivers)
        {
            //Update Observer's to make him receive msg
            rec.update();//update()[In RECEIVER class] is dependent on getUpdate(Receiver)[]In provider class below
        }
    }

    @Override
    public Object getUpdate(Receiver receiver) {
        return this.msg;
    }

    //To post msg
    @Override
    public void sendMessage(String subject,String content,Departments toDept) {
        this.msg.setSubject(subject);
        this.msg.setContent(content);
        this.msg.setTodept(toDept);
        System.out.println("Message posted to department : "+this.msg.getTodept().name());
        notifyReceivers();
    }
}
