/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wmacevoy
 */
public class ListSpeedTestTest {
    
    public ListSpeedTestTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testCollectionsSortSpeed() {
        ListSpeedTest test =  new ListSpeedTest();
        test.setAction(new SortAction());
        test.start();
        test.waitTilFinish();
        String result = test.outcome();
        System.out.println("array time = " + test.arrayWorker.millis);
        System.out.println("linkedlist  time = " + test.linkedWorker.millis);
        assertTrue(result.startsWith("array"));
    }
    
}
