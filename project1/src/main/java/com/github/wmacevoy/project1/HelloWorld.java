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
        helloWorld.printMessage();
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
     * @param _message new value of message
     */
    public void setMessage(String _message) {
        if (_message != null) {
            message = _message;
        } else {
            throw new UnsupportedOperationException("message cannot be null");
        }
    }

    public void printMessage(PrintStream out) {
        out.println("message: " + getMessage());
    }

    public void printMessage() {
        HelloWorld.this.printMessage(System.out);
    }

}
