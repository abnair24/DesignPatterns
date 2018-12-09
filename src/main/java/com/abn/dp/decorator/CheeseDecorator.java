package com.abn.dp.decorator;

public class CheeseDecorator extends SandwichDecorator {


    static final int PRICE = 5;

    Sandwich sandwich;

    public CheeseDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public int price() {
        return sandwich.price() + PRICE;
    }

    @Override
    public String getDescription() {
        return sandwich.getDescription() + " Cheese";
    }
}
