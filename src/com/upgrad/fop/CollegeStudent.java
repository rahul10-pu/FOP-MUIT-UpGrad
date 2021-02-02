package com.upgrad.fop;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class CollegeStudent extends Person{
    int year;

    public CollegeStudent(String name, int year) {
        super(name);
        this.year = year;
    }
    void getDetails(){
        System.out.println(year);
    }
}
