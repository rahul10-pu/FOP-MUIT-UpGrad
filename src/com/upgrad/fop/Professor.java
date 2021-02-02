package com.upgrad.fop;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Professor extends Person {
    int employeeNumber;

    public Professor(String name, int employeeNumber) {
        super(name);
        this.employeeNumber = employeeNumber;
    }
    void getDetails(){
        System.out.println(employeeNumber);
    }
}
