/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;

/**
 *
 * @author Hvuser
 */
@Stateless(name = "Convertbean1", mappedName = "Convertbean2")
public class ConvService implements  ConvRemote {
      public ConvService(){
    System.out.println("Conversion");
}
      
    @PostConstruct
    public void myconvert(){
        System.out.println("post construct");
    }
    
    @PreDestroy
    public void mydestroy1(){
        System.out.println("destroyed");
    }
    @Override
    
    public double conversion(double degree)
    {
        double conv = (9/5)*degree+32;
        return conv;
    }
}
