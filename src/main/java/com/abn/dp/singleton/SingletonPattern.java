package com.abn.dp.singleton;

public class SingletonPattern {

    private static volatile SingletonPattern instance;

    private SingletonPattern() {}

    public static SingletonPattern getInstance() {
        if( instance == null) {
            /*
            For multithreaded case
             */
            synchronized (SingletonPattern.class) {
                instance = new SingletonPattern();
            }
        }
        return instance;
    }
}
