/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.List;

/**
 *
 * @author wmacevoy
 */
public class SerializedAction implements Action 
{
    Action action;
    private Object lock = new Object();
    
    SerializedAction(Action _action) {
        action = _action;
    }

    @Override
    public void actOn(List list) {
        synchronized(lock) {
            System.out.println("acting on " + Integer.toHexString(System.identityHashCode(list)));
            action.actOn(list);
            System.out.println("finished acting on " +  Integer.toHexString(System.identityHashCode(list)));
        }
    }
    
}
