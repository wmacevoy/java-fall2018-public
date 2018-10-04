/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.List;
import java.util.Random;

/**
 *
 * @author wmacevoy
 */
public class RandomizeAction implements Action {
    int size;
    RandomizeAction(int _size) {
        size = _size;
    }
    
    Random rng = new Random();
    
    int randomInt(int a, int b) {
        return rng.nextInt(b-a+1)+a;
    }
    
    String randomString() {
        StringBuilder sb = new StringBuilder();
        int length = randomInt(0,16);
        for (int i=0; i<length; ++i) {
            int codePoint = randomInt(32, 100_000);
            sb.appendCodePoint(codePoint);
        }
        return sb.toString();
    }

    @Override
    public void actOn(List list) {
        list.clear();
        for (int i=0; i<size; ++i) {
            list.add(randomString());
        }
    }
    
    
}
