package com.upgrad.fop;

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v=new Van();//from the refrence variable of the interface, we can catch the object of the class which has done it's implementation
        System.out.println(v.wheels);
        System.out.println(Vehicle.wheels);
        v.price();
 //       v.getwheels();//getwheels is not there in Vehicle interface
        Van vv=new Van();
        vv.getwheels();
        vv.getMaxSpeed();
        v.getMaxSpeed();
    }
}
