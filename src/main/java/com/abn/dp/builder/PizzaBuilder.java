package com.abn.dp.builder;

public abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizzaBuilder(){
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildTopping();
}
