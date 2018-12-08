package com.abn.dp.factory.abstractFactory;

public abstract class FurnitureFactory {

    private static final VictorianFactory VICTORIAN_FACTORY = new VictorianFactory();
    private static final ModernFactory MODERN_FACTORY = new ModernFactory();

    public static FurnitureFactory getFurniture(String type){
        FurnitureFactory furnitureFactory = null;

        switch(type.toLowerCase()) {
            case "modern":
                furnitureFactory = MODERN_FACTORY;
                break;

            case "victorian":
                furnitureFactory = VICTORIAN_FACTORY;
                break;
        }
        return furnitureFactory;
    }

    public abstract Chair createChair();

    public abstract Sofa createSofa();
}
