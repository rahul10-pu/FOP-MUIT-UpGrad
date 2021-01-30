package com.upgrad.test;

import com.upgrad.fop.Car;

public class TestClass extends Car{
    Car newCar= new Car();
    void testFunction(){
//        String testData=newCar.name; //private
//        String testData1=newCar.price;  //default
//        String testData2=newCar.colour; //public
//        String testData3=newCar.noOfDoors; //protected
//        System.out.println(this.name);
//        System.out.println(this.price);
        System.out.println(this.colour);
        System.out.println(this.noOfDoors);

    }

}
