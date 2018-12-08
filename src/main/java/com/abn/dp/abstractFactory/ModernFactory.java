package com.abn.dp.abstractFactory;

public class ModernFactory extends FurnitureFactory {


    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}
