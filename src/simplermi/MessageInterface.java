/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package simplermi;

/**
 *
 * @author tnealo01
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MessageInterface extends Remote {
    
    void setStore(String store);
            
    String getMessage();
    
    String query(String message) throws RemoteException;
    
    String contact(String message) throws RemoteException;
    
    String sayHello(String name) throws RemoteException;
}
