package com.upgrad.fop;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Trying to divide 1 by zero");
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two number for division");
        int a=in.nextInt();
        int b=in.nextInt();
        int result=0;
        try{
            if(b==0){
                throw new ArithmeticException("This can't be used");
            }
            System.out.println("going to divide");
            result=a/b; // handle the Exception when b=0
            System.out.println("Yeahhh...divide ho gya mere se");
        }catch(Exception aoe){
            System.out.println("Sorry your input caused some issue with my brain..please don't try that again");
        }finally {
            System.out.println("Jai mata di");
        }
        System.out.println(result);
        System.out.println("It's done..thanks for using");
    }
}
