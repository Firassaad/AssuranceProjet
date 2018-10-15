package com.example.demo.Entities;

public class EmailMessage {
    private String to_adress;
    private String subject ;
    private String body ;

    public String getTo_adress() {
        return to_adress;
    }

    public void setTo_adress(String to_adress) {
        this.to_adress = to_adress;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
