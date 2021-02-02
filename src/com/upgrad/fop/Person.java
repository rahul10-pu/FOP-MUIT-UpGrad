package com.upgrad.fop;

abstract public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }
    void getName(){
        System.out.println(name);
    }
    abstract void getDetails();
}
// class is abstract, object of that class can't be created
