package com.company.interfaces;

import com.company.model.Departments;
import com.company.model.Message;

/**
 * Created by Elimane on May, 2020, at 11:21
 */
public interface Subject {

    public void register(Receiver receiver);

    public void unRegister(Receiver receiver);

    public void notifyReceivers();

    public Object getUpdate(Receiver receiver);

    public void sendMessage(String subject, String content, Departments toDept);

}
