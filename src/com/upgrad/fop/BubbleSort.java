package com.upgrad.fop;

public class BubbleSort {
    public static void printArray(int[] arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static void bubbleSortUsingRecursion(int arr[], int n){
        //System.out.println(n);
        //base case
        if(n==1){
            return;
        }
        for(int i=0;i<n-1;i++){

            if(arr[i]>arr[i+1]){
               // System.out.println(arr[i]+" "+arr[i+1] );
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
               // printArray(arr);
            }
        }

        //recursive call
        bubbleSortUsingRecursion(arr,n-1);
    }
    public static void main(String[] args) {
        int []arr={2,3,4,1,0};
        bubbleSortUsingRecursion(arr, arr.length);
        printArray(arr);
    }
}
