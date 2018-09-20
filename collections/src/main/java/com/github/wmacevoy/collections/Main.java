/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.wmacevoy.collections;

/**
 *
 * @author wmacevoy
 */
public class Main {
    public static void main(String [] args) throws Exception {
        Main main = new Main();
        main.run();
    }
    
    void run() {
        Market market = new Market();
        market.addItem("cheese", 100);
        market.addItem("solar power strip", 33);
        market.printSales(10);
    }
    
}
