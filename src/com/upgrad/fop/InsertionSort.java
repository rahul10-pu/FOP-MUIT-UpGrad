package com.upgrad.fop;

public class InsertionSort {
    public static void main(String[] args) {
        int []arr={2,3,4,1,0};
        InsertioSortUsingLoop(arr);
        printArray(arr);
    }
    public static void printArray(int[] arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static void InsertioSortUsingLoop(int []arr){
        int length=arr.length;
        int left=0, key=0;
        for(int i=1;i<length;i++){
            key=arr[i];
            left=i-1;
            while(left>=0 && arr[left] > key){

                arr[left+1]=arr[left];
                left=left-1;

            }
            arr[left+1]=key;

        }
    }
}
