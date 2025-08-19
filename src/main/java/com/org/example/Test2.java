package com.org.example;


class Factory{
    private static Factory instance;

    private String factoryName;

    private Factory(){
        this.factoryName = getClass().getSimpleName();
    }

    public static Factory getInstance(){
        if(instance == null){
            return new Factory();
        }
        return instance;
    }

}
public class Test2 {
}
