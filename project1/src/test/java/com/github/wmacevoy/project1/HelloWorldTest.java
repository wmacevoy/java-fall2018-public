/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.wmacevoy.project1;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author warren
 */
public class HelloWorldTest {

    public HelloWorldTest() {
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

    /**
     * Test of main method, of class HelloWorld.
     */
    @org.junit.Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;

        // https://stackoverflow.com/questions/2169330/java-junit-capture-the-standard-input-output-for-use-in-a-unit-test
        PrintStream saveOut = System.out;
        ByteArrayOutputStream myOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(myOut));
        try {
            String expect = "";

            HelloWorld.main(args);
            String result = myOut.toString();
            assertEquals(expect, result);

        } finally {
            System.setOut(saveOut);
        }
    }

    /**
     * Test of getMessage method, of class HelloWorld.
     */
    @org.junit.Test
    public void testGetMessage() {
        System.out.println("getMessage");
        HelloWorld instance = new HelloWorld();
        String expResult = "";
        String result = instance.getMessage();
        assertEquals(expResult, result);

    }

    @Test
    public void testGetMessage2() {
        System.out.println("getMessage2");
        HelloWorld instance = new HelloWorld();
        String expResult = "new message";
        instance.setMessage(expResult);
        String result = instance.getMessage();
        assertEquals(expResult, result);
    }

    /**
     * Test of setMessage method, of class HelloWorld.
     */
    @org.junit.Test
    public void testSetMessage() {
        System.out.println("setMessage");
        HelloWorld instance = new HelloWorld();
        assertEquals("", instance.getMessage());
        String expect = "new message";

        instance.setMessage(expect);
        assertEquals(expect, instance.getMessage());
    }

    /**
     * Test of sayHello method, of class HelloWorld.
     */
    @org.junit.Test
    public void testSayHello_PrintStream() {
        System.out.println("sayHello");
        HelloWorld instance = new HelloWorld();

        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(buffer);

        String message = "test!";
                
        String expect = "test!" + System.lineSeparator();

        instance.setMessage(expect);
        instance.sayHello(out);
        String result = buffer.toString();
        assertEquals(expect, result);
    }

    /**
     * Test of sayHello method, of class HelloWorld.
     */
    @org.junit.Test
    public void testSayHello_0args() {
        System.out.println("sayHello");
        HelloWorld instance = new HelloWorld();
        instance.sayHello();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
