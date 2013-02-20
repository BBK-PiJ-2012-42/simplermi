/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplermi;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    
    private void startServer(){
        try {
            // create on port 1099
            Registry registry = LocateRegistry.createRegistry(80);
            
            // create a new service named myMessage
            registry.rebind("myMessage", new MessageImpl());
        } catch (Exception e) {
            e.printStackTrace();
        }      
        System.out.println("system is ready");
    }
    
    public static void main(String[] args) {
        Server main = new Server();
        main.startServer();
    }
}
