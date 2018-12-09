package com.abn.dp.builder;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BuilderClient {

    @Test
    public void test1() throws Exception {

        Pizza spicyPizza = new PizzaBuilder()
                .withDough("spicy dough")
                .withSauce("spicy sauce")
                .withTopping("spicy topping")
                .build();

        assertThat(spicyPizza.getDough()).hasToString("spicy dough");
        assertThat(spicyPizza.getSauce()).hasToString("spicy sauce");
        assertThat(spicyPizza.getTopping()).hasToString("spicy topping");
    }
}
