package com.abn.dp.decorator;

public abstract class Sandwich {

    protected String description = "Sandwich";

    public String getDescription() {
        return description;
    }

    public abstract int price();
}
