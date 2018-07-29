package com.websystique.spring.domain.impl;
 
import com.websystique.spring.domain.Messaging;
 
public class ActiveMQMessaging implements Messaging{
	
 public ActiveMQMessaging() {
System.out.println("in def constr of ActiveMQ");
 }
    public void sendMessage() {
        System.out.println("Sending Message via Active MQ");
    }
 
}