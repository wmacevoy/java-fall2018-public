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
class Cart {
    Customer customer;
    Market market;
    
    Items items = new Items();

    Cart(Market _market, Customer _customer) {
        market = _market;
        customer = _customer;
    }
    
    void addItem(String name) {
        for (Item marketItem : market.items) {
            if (marketItem.name.equals(name)) {
                items.add(marketItem);
                market.items.remove(marketItem);
                return;
            }
        }
        throw new IllegalStateException("item " + name + " does not exit in market");
    }

    boolean hasItemByName(String name) {
        return items.hasItemByName(name);
    }

    void checkout() {
        if (customer.moneyInCents >= items.totalInCents()) {
            customer.moneyInCents -= items.totalInCents();
            customer.items.addAll(items);
            items.clear();
        } else {
            throw new IllegalStateException("customer does not have enough money");
        }
    }
}
