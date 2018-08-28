/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.wmacevoy.project1;

import java.io.PrintStream;

/**
 *
 * @author warren
 */
public class HelloWorld {

    public static void main(String[] args) throws Exception {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }

    private String message = "";

    /**
     * Get the value of message
     *
     * @return the value of message
     */
    public String getMessage() {
        return message;
    }

    /**
     * Set the value of message
     *
     * @param message new value of message
     */
    public void setMessage(String message) {
        if (message != null) {
            this.message = message;
        } else {
            throw new UnsupportedOperationException("message cannot be null");
        }
    }

    public void sayHello(PrintStream out) {
        out.println(getMessage());
    }

    public void sayHello() {
        sayHello(System.out);
    }

}
