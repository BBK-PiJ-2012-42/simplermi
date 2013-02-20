/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplermi;

/**
 *
 * @author tnealo01
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MessageImpl extends UnicastRemoteObject implements MessageInterface {
    public String serverStore = null;
    public String clientStore = null;
    
    
    public MessageImpl() throws RemoteException {        
    }
    
    @Override
    public String sayHello(String name) throws RemoteException {
        System.out.println("hello "+name);
        return "This is the server calling "+name;
    }

    @Override
    public String contact(String message) throws RemoteException {
        this.clientStore = message;
        return serverStore;
    }
    
}