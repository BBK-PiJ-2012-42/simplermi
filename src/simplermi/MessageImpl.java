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
    public String serverStore = "DEF";
    public String clientMessage = "DEF";
    
    
    public MessageImpl() throws RemoteException {        
    }
    
    public void setStore(String store) {
        serverStore = store;
    }
    
    public String getMessage() {
        return clientMessage;
    }
    
    public String query(String message) {
        clientMessage = message;
        return serverStore;
    }
    
    @Override
    public String sayHello(String name) throws RemoteException {
        System.out.println("hello "+name);
        return "This is the server calling "+name;
    }

    @Override
    public String contact(String message) throws RemoteException {
        this.clientMessage = message;
        return serverStore;
    }
    
}