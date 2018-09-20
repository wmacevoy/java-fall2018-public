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
public class Customer {
    int orderNumber;
    String name;
    int moneyInCents;
    Customer(String _name, int _moneyInCents) {
        name= _name;
        moneyInCents = _moneyInCents;
    }

    boolean hasItemByName(String name) {
        return items.hasItemByName(name);
    }
    
    Items items = new Items();
}

