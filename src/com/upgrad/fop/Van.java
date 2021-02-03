package com.upgrad.fop;

public class Van implements Vehicle {
    String colour;
    public void price(){
        System.out.println("Price of the Van is 10000");
    }
    void getwheels(){
        System.out.println(this.wheels);
    }
    public void getMaxSpeed(){
        System.out.println("Max speed of the VAn is 80KM/Hr");
    }
}
