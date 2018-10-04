/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author wmacevoy
 */
public class SortAction implements Action {

    @Override
    public void actOn(List list) {
        list.sort(null);
    }
    
    
}
