package com.upgrad.fop;

public class Function {
    public static void main(String[] args) {
        System.out.println(1);
        int countData;
        int two=222;
        countData=print2(two,2,22);
        System.out.println(countData);
        System.out.println(two);
    }
    static int print2(int two,int data2,int data3){
        String information=print3();
        System.out.println(information+" 2222");
        System.out.println(two);
        int count=2;
        two=two+4;
        return two;
    }
    static String print3(){
        System.out.println(3);
        String msg="Printed 3";
        return msg;
    }
    //void -- the function is not returning any value
    static void print7(){
        System.out.println(7);
    }
    static void printDataOnscreen(){
        System.out.println("Hello 2021");
        System.out.println("Hello0000");
        System.out.println("Hello111111");
        System.out.println("Hello444444");
    }
    /*
    function -2 type
    1. User defined function
    2.Pre-defined function
    return_type function_name(){
        Statements-1
        Statements-2
        .....
        ...
    }
    function math -> f(x)=2x + 5x + 1
     */

}
