package com.upgrad.fop;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int count=10;
//        count=count+1;// count=0+1
//        System.out.println(count); // 1
//        count=count+1;
//        System.out.println(count); // 2
//        int count=3;
//        while(count>100){
//            System.out.println(count);
//            count=count+1;
//        }
//        System.out.println("Hi");
//        int count=4;
//        do{
//            System.out.println(count);
//            count=count-1;
//        }while(count>2);
//        System.out.println("Hi");
        /*
        for(initialization; condition ; increment){
            System.out.println("Hi");
        }
         */
//        int count=0;
//        for( ;count<3; ){
//            System.out.println(count);
//            count=count+1;
//        }
////        System.out.println("Hi");
//        for(int i=0;i<10;i=i+1){
//            System.out.println(i);
//            if(i==2){
//                break;
//            }
//            System.out.println("Bye");
//        }
//        for(int num=2;num<100;num=num*2){
//            System.out.println(num);
//            break;
//        }
//        for(int i=0;i<4;i=i+1){
//            System.out.println(i);
//            if(i==2){
//                continue;
//            }
//            System.out.println("Bye");
//        }
//        for(int i=2;i<50;i=i*i){
//            if (i==4){
//                System.out.println("We want to skip all the below lines in this loop");
//                continue;
//            }
//            System.out.println(i);
//        }
//        System.out.println("Hi");
//        int size;
//        Scanner input= new Scanner(System.in);
//        System.out.print("Enter the size of your array: ");
//        size=input.nextInt();
//        int[] arr=new int[size];
//        for(int i=0;i<=size;i++){
//            arr[i]=input.nextInt();
//        }
//        System.out.println("We took all your Inputs for the array");
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]);
//        }
//        System.out.println("We are done");


        int size;
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the size of your array: ");
        size=input.nextInt();
        String[] arr=new String[size];
        arr[0]=input.next();
        arr[1]=input.next();
        arr[2]=input.next();
//        for(int i=0;i<size;i++){
//            arr[i]=input.next();
//        }
        System.out.println("We took all your Inputs for the array");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        System.out.println("We are done");
    }
}
