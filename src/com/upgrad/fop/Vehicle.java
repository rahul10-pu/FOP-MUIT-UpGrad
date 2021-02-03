package com.upgrad.fop;

public interface Vehicle {
    int wheels=4;
    void price();
    default void getMaxSpeed(){
        System.out.println("default speed is 40KM/h");
    }
}
/*
public interface Vehicle {
    public static final int wheels=4;
    public abstract void price();
}
 */