package com.abn.dp.builder;

public class VeggiePizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("veggie dough");
    }

    public void buildSauce() {
        pizza.setSauce("veggie sauce");
    }

    public void buildTopping() {
        pizza.setTopping("veggie topping");
    }

}
