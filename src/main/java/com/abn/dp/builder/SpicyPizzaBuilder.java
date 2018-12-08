package com.abn.dp.builder;

public class SpicyPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("spicy dough");
    }

    public void buildSauce() {
        pizza.setSauce("spicy sauce");
    }

    public void buildTopping() {
        pizza.setTopping("spicy topping");
    }

}
