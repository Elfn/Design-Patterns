package com.company;

import com.company.model.Departments;
import com.company.model.Provider;
import com.company.model.Subscriber;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Provider provider = new Provider();

        //Create Observer
        Subscriber subs1 = new Subscriber("Eric Jean","ej@gmail.com",true, Departments.IT);
        Subscriber subs2 = new Subscriber("John scott","js@gmail.com",true, Departments.HR);
        Subscriber subs3 = new Subscriber("Franck Doe","fd@gmail.com",true, Departments.CLIENT_SUPPORT);
        Subscriber subs4 = new Subscriber("Marie currie","mc@gmail.com",true, Departments.HR);
        Subscriber subs5 = new Subscriber("Matt Tiger","mt@gmail.com",true, Departments.IT);

        //Register Observers to allows them receive message from provider
        provider.register(subs1);
        provider.register(subs2);
        provider.register(subs3);
        provider.register(subs4);
        provider.register(subs5);

        //Send Message only to those in HR Department
        provider.sendMessage("New Computers","There are new computers",Departments.IT);
        //Result :

//        Message posted to department : IT
//        Eric Jean from IT department Retrieving message: New Computers
//        Matt Tiger from IT department Retrieving message: New Computers

    }
}
