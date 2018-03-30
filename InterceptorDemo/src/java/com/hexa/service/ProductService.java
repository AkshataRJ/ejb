/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexa.service;

import java.util.HashMap;
import java.util.Map;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.interceptor.Interceptors;

/**
 *
 * @author Hvuser
 */
@Stateless(name = "pbean1",mappedName = "pbean2")
@Interceptors({MyInterceptor.class})
public class ProductService implements ProductRemote {
private static Map<Integer,Product> map;
static{
map = new HashMap<>();
map.put(39717, new Product(39717,"aksh",12345));
map.put(39723, new Product(39723,"amri",1234));
map.put(39718, new Product(39718,"shar",12346));
}
    @Override
    public Product getProduct(int pid) {
        
        System.out.println("inside getProduct()");
       return map.get(pid);
    }

    
}
