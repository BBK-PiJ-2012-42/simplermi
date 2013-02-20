/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplermi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {
    
    private void doTest(){
        try {
			// fire to localhost port 1099
            Registry myRegistry = LocateRegistry.getRegistry("127.0.0.1", 80);
			
			// search for myMessage service
            MessageInterface impl = (MessageInterface) myRegistry.lookup("myMessage");
			
			// call server's method			
            String response = impl.sayHello("edwin");
			
            System.out.println("Message Sent");
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    public static void main(String[] args) {
        Client main = new Client();
        main.doTest();
    }
}
