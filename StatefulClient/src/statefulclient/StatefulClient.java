/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statefulclient;

import com.hexa.service.InterestRemote;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Hvuser
 */
public class StatefulClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NamingException {
        
        
        System.out.println("client started");
        Properties props = new Properties();
        props.setProperty(Context.INITIAL_CONTEXT_FACTORY,"com.sun.enterprise.naming.SerialInitContextFactory");
        props.setProperty("org.omg.CORBA.ORBInitialHost","Localhost");
        props.setProperty("org.omg.CORBA.ORBInitialPort","3700");
        
        Context ctx = new InitialContext(props); 
         InterestRemote ser = (InterestRemote)ctx.lookup("ibean2");
         ser.setData(2000,5,7.5f);
         System.out.println(ser.calcSimple());
         System.out.println(ser.calcCompound());
         System.out.println(ser.getBname());
         ser.invalidate();//removing the bean expicitly.
    }
    
}
