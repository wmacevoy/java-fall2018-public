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
public class Market {
    Customers customers = new Customers();
    Items items = new Items();
//    Registers registers;
//    Customers customers;

    void addItem(String name, int priceInCents) {
        items.add(new Item(name,priceInCents));
    }
    
    void printSales(int discountInPercent) {
        for (Item item : items) {
            int discountPrice = item.priceInCents * (100-discountInPercent)/100;
            System.out.println("buy " + item.name + " for only " + discountPrice + " cents");
        }
    }

    boolean hasItemByName(String name) {
        return items.hasItemByName(name);
    }

    Cart getCartFor(Customer customer) {
        return new Cart(this, customer);
    }
}
