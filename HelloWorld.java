package com.upgrad.fop;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        //purpose was to print the information "Hellw 2021"
        //System.out.println(information);
//        String information="Hello World";
//        System.out.println(information); // data - information //System.out.println("Hello World")
//        System.out.println(information);
//        System.out.println(information);
//        String newInfo=" and Happy New Year";   // variable is an annotation given to our information
//        System.out.println(information+newInfo);
//        String a=information+newInfo;
//        System.out.println(a);
        // variable ---> 1. primitive data Type(int, short,long, boolean, byte, char, float, double)
        //               2. Non-primitive data type (String, array, arraylist, linkedlist, tree)
        // keyword - reserved words which cannnot be used as variable name
        // int, short,long, boolean, byte, char, float, double....
//        String String="hello";
//        System.out.println(String);
//        int number=100;
//        boolean flag=3==3;
//        boolean flaG=false;
//        float dec=1.12345678f;  // if given more that 7 decimal number..then 7th will the round off figure
//        double doub=1.1f;   // lower data(float) type to higher data type(double)
//        char charac='W';
//        byte b=126;     // size 1 byte
//        byte c=127;
//        int _ab_c;   // first char - variable always start with alphabets or _
        // for other chars - numbers, Alphabets, _
        // lower camel case - rollNumber
//        System.out.println(flag);       // System.out.print(number) ==> 100 (without going to new line)
//        System.out.println(flag);
//        System.out.println(doub);
//        System.out.println(charac);
//        System.out.println(b);

        // from data types -  it can store diffrent type --> beacuse of size
//        System.out.println("byte " + Byte.BYTES);
//        System.out.println("char " + Character.BYTES);
//        System.out.println("int " + Integer.BYTES);
//        System.out.println("long " + Long.BYTES);
//        System.out.println("short " + Short.BYTES);
//        System.out.println("double " + Double.BYTES);
//        System.out.println("float " + Float.BYTES);     // print in Bytes
//        System.out.println("float " + dec.SIZE);    // print in bits

//        float num1=10;
//        float num2=3;
//        System.out.println(num1/num2); // int/int = int
//        System.out.println(num1/num2); // int/float = float
//        System.out.println(num1/num2);      // float/int = float
//        System.out.println(num1/num2); // float/float= float
 //       int result=num1/num2;   // invalid initialization
        // % - even or odd, hash function
//        int result=101%2;// % gives the remainder as a output
//        System.out.println(result);
//        System.out.println("Please Enter 2 number for addition");
//        Scanner input= new Scanner(System.in);
//        int num1,num2;
//        num1=input.nextInt();
//        num2=input.nextInt();
//        System.out.println("Addition of given 2 numbers is "+ (num1+num2));
//        char in='a';
//        char in2='A';
//        char in3='1';
//        System.out.println((int)in);    // print ascii values
//        System.out.println((int)in2);
//        System.out.println((int)in3);

        String students[]=new String[3];    // DataType VariableName[] = new DataType[size];
        String newStudents[]={"name-1","name-2"};
        students[0]="name-1";
        students[1]="name-2";
        students[2]="name-3";
//        students[3]="name-4";
        System.out.println(newStudents[1]);
//        students[3]="name-4";
//        char roll[]=new char[3];


    }
}
