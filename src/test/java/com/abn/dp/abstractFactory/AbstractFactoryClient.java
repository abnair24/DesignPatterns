package com.abn.dp.abstractFactory;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AbstractFactoryClient {

    @Test
    public void test1() throws Exception {

        FurnitureFactory furnitureFactory = FurnitureFactory.getFurniture("MODERN");
        Chair chair = furnitureFactory.createChair();
        assertThat(chair.sitOn()).hasToString("Modern chair");
    }

    @Test
    public void test2() throws Exception {
        FurnitureFactory furnitureFactory = FurnitureFactory.getFurniture("VICTORIAN");
        Sofa sofa = furnitureFactory.createSofa();
        assertThat(sofa.sleepOn()).hasToString("Victorian Sofa");
    }

    @Test
    public void test3() throws Exception {
        FurnitureFactory furnitureFactory =FurnitureFactory.getFurniture("MODERN");
        Sofa sofa = furnitureFactory.createSofa();
        assertThat(sofa.sleepOn()).hasToString("Modern Sofa");
    }

    @Test
    public void test4() throws Exception {
        FurnitureFactory furnitureFactory = FurnitureFactory.getFurniture("VICTORIAN");
        Chair chair = furnitureFactory.createChair();
        assertThat(chair.sitOn()).hasToString("Victorian chair");
    }
}
