package com.company.model;

import com.company.interfaces.Receiver;
import com.company.interfaces.Subject;

import java.util.ArrayList;

/**
 * Created by Elimane on May, 2020, at 11:38
 */
//OBSERVER
public class Subscriber implements Receiver {

    private String firstName_LastName;
    private String email;
    private boolean isThere;
    private Departments department;
    private Subject provider;

    private ArrayList<Message> messagesBox;

    public Subscriber(String firstName_LastName, String email, boolean isThere, Departments department) {
        this.firstName_LastName = firstName_LastName;
        this.email = email;
        this.isThere = isThere;
        this.department = department;
        this.messagesBox = new ArrayList<>();
    }

    @Override
    public void update() {
        Message receivedMsg = (Message) this.provider.getUpdate(this);
        String result = (receivedMsg.getTodept().name().equals("CLIENT_SUPPORT")) ? "CLIENT_SUPPORT" : (receivedMsg.getTodept().name().equals("IT")) ? "IT" : (receivedMsg.getTodept().name().equals("HR")) ? "HR" : "ERROR";

        //CHECK OBSERVER'S DEPARTMENT before send msg
        if(result.equals(this.department.name()))
        {
            //Observer received msg in his mailbox
            this.messagesBox.add(receivedMsg);


            //Acknowledgment of receipt
            if(this.messagesBox == null)
            {
                System.out.println(this.firstName_LastName + " No new message");
            }
            else
            {
                System.out.println(this.firstName_LastName + " from "+this.department.name()+" department Retrieving message: "+ receivedMsg.getSubject());
            }

        }
    }

    @Override
    public void subscription(Subject subject) {
        this.provider = subject;
    }

    public String getFirstName_LastName() {
        return firstName_LastName;
    }

    public void setFirstName_LastName(String firstName_LastName) {
        this.firstName_LastName = firstName_LastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isThere() {
        return isThere;
    }

    public void setThere(boolean there) {
        isThere = there;
    }

    public Departments getDepartment() {
        return department;
    }

    public void setDepartment(Departments department) {
        this.department = department;
    }
}
