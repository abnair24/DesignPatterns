package com.abn.dp.builder;

public class PizzaBuilder {

    protected Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    public Pizza build() {
        return pizza;
    }

    public PizzaBuilder withDough(String dough) {
        pizza.setDough(dough);
        return this;
    }

    public PizzaBuilder withSauce(String sauce) {
        pizza.setSauce(sauce);
        return this;
    }

    public PizzaBuilder withTopping(String topping) {
        pizza.setTopping(topping);
        return this;
    }
}
