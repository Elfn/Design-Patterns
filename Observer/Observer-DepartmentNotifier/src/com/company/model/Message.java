package com.company.model;

/**
 * Created by Elimane on May, 2020, at 19:55
 */
public class Message {
    private String subject;
    private String content;
    private Departments todept;

    public Message() {
    }

    public Message(String subject, String content, Departments todept) {
        this.subject = subject;
        this.content = content;
        this.todept = todept;
    }

    public Departments getTodept() {
        return todept;
    }

    public void setTodept(Departments todept) {
        this.todept = todept;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
