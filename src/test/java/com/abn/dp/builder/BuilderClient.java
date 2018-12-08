package com.abn.dp.builder;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderClient {

    @Test
    public void test1() throws Exception {
        Director director = new Director();
        PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();

        director.setPizzaBuilder(spicyPizzaBuilder);
        director.constructPizza();

        assertThat(director.getPizza().getDough()).hasToString("spicy dough");
        assertThat(director.getPizza().getSauce()).hasToString("spicy sauce");
        assertThat(director.getPizza().getTopping()).hasToString("spicy topping");

    }
}
