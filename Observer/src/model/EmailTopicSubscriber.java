package model;

import interfaces.Observer;
import interfaces.Subject;

/**
 * Created by Elimane on Apr, 2020, at 23:17
 */
public class EmailTopicSubscriber implements Observer {

    private String name;
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        //Get message concerning one emailTopicSubscriber
        //and display it with the name of the concerned observer
       String msg = (String) topic.getUpdate(this);

        if(msg == null)
        {
            System.out.println(name + " No new message on this topic");
        }
        else
        {
            System.out.println(name + " Retrieving message: "+ msg);
        }
    }

    //Allowing mapping with Provider/Broadcaster
    @Override
    public void setSubject(Subject subject) {
       this.topic = subject;
    }
}
