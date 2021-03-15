package com.upgrad.fop;

public class Fibo {
    public static int fibu(int n){
        if(n<=1){
            return n;
        }
        int k=fibu(n-1);
        int z=fibu(n-2);
        return k+z;
    }
    public  static int fibUsingLoop(int input){
        //for calculating the fibo of the given input
        int fib[]=new int[input+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<=input;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        return fib[input];
    }
    public static int fibUsingConstSpace(int input){
        int a=0, b=1, c=input;
        for(int i = 2;i<=input;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String[] args) {
        int n=5;
        int result=0;
        result=fibu(n);
        System.out.println(result);
        System.out.println(fibUsingLoop(n));
    }

}
