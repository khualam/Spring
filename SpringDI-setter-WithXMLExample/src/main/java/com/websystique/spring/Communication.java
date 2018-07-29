package com.websystique.spring;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import com.websystique.spring.domain.*;
 
public class Communication {
	
	 private Messaging messaging;
	  
	 public Communication() {
		super();
		System.out.println(" in default constr of Communication");
	}
     
	 
    public Communication(Messaging messaging) {
		super();
		this.messaging = messaging;
		System.out.println(" in para constr of Communication");
	}
	
      
	public void setMessaging(Messaging messaging){
    	
        this.messaging = messaging;
        System.out.println("in setter method");
    }
 
    public void communicate(){
        messaging.sendMessage();
    }
}
