package com.abn.dp.strategy;

import org.testng.annotations.Test;

public class StrategyClient {

    @Test
    public void test() throws Exception {

        Cart cart = new Cart();

        cart.addItem(new Item(10));
        cart.addItem(new Item(20));

        cart.pay(new PaypalStrategy("dummy@mail.com","pass"));

        cart.pay(new CreditCardStrategy("name","1231414324235","123","123446"));
    }
}
