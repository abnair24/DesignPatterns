package com.abn.dp.strategy;

import com.sun.tools.javac.jvm.Items;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    List<Item> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int total() {
        int sum =0;
        for(Item i : items){
            sum += i.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentStrategy) {
        int amount = total();

        paymentStrategy.pay(amount);
    }
}
