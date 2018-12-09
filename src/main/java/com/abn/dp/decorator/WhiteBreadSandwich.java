package com.abn.dp.decorator;

public class WhiteBreadSandwich extends Sandwich {

    static final int PRICE = 10;


    public WhiteBreadSandwich(String description) {
        this.description = description;
    }

    @Override
    public int price() {
        return PRICE ;
    }
}
