/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplermi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
    MessageImpl postman;
    
    
    private void startServer(){
        try {
            // create on port 1099
            Registry registry = LocateRegistry.createRegistry(80);
            postman = new MessageImpl();
            // create a new service named myMessage
            registry.rebind("myMessage", postman);
            postman.setStore("Dollar Bill!");
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
