/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import javax.interceptor.AroundInvoke;
import javax.interceptor.InvocationContext;


public class MyInterceptor {
    
    @AroundInvoke
    public Object intercept(InvocationContext ctx) throws Exception{
    String mtd = ctx.getMethod().getName();
     String cls = ctx.getTarget().getClass().getSimpleName();
     System.out.println("logged out" + mtd +" of class " + cls);
     Object[] arr = ctx.getParameters();
     int pid = (int) arr[0];
     if(pid>=39700 && pid<39730){
     
     Object obj = ctx.proceed();
     System.out.println("logged out"+ mtd +" of class" + cls);
     return obj;
     }
    return null;
            
}
}
