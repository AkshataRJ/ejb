/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;
import javax.jms.TextMessage;

/**
 *
 * @author Hvuser
 */
@MessageDriven(mappedName="mbean1",activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationLookup", propertyValue = "myqueue"),
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue")
})
public class MdbDemo1 implements MessageListener {
    
    public MdbDemo1() {
        
    }
    
    @Override
    public void onMessage(Message message) {
        try {
        if (message instanceof TextMessage){
            TextMessage tm = (TextMessage)message;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        System.out.println(" received from queue "+ tm.getText());
    }  else{
            ObjectMessage om = (ObjectMessage)message;
            Emp emp = (Emp)om.getObject();
            System.out.println("received"+emp.getEid()+" "+emp.getEname());
            }  
        //this received message can be further processed.
        }catch (JMSException ex ){
        System.out.println(ex.getMessage());
    }
    }
    
}
