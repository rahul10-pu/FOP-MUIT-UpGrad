package com.upgrad.fop;

abstract public class CollegeStaff extends Person{
    int id;

    public CollegeStaff(String name, int id) {
        super(name);
        this.id = id;
    }
//    void getDetails(){
//        System.out.println("hi staff");
//    }
}
/*
if you are extending the abstract class, you have 2 options:
    1. Implement all the abstract method of the child class
    2. Make that child class abstract
 */
