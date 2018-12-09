package com.abn.dp.decorator;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DecoratorClient {

    @Test
    public void test() throws Exception {
        Sandwich sandwich = new WhiteBreadSandwich("WB Sandwich");
        assertThat(sandwich.getDescription()).hasToString("WB Sandwich");
        assertThat(sandwich.price()).isEqualTo(10);

        sandwich = new CheeseDecorator(sandwich);
        assertThat(sandwich.getDescription()).hasToString("WB Sandwich Cheese");
        assertThat(sandwich.price()).isEqualTo(15);
    }
}
