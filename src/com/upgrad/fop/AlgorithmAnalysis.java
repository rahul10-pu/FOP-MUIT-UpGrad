package com.upgrad.fop;

public class AlgorithmAnalysis {
    public static void main(String[] args) {
        int arr[]={11,23,3};
        find(arr,540,0);
        System.out.println("Done");
    }
    public static void find(int arr[],int input,int index){
        if(index>= arr.length){
            System.out.println("Not Found");
            return;
        }
        if(arr[index]==input ){
            System.out.println("Found");
            return;
        }
        index=index+1;
        find(arr,input,index);
        System.out.println(index);
    }
}
