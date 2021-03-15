package com.upgrad.fop;

public class SelectionSort {
    public static void selectionSortUsingMin(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min= i;
            for(int j=i+1;j<n;j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            //now swap
            int temp= arr[min];
            arr[min]=arr[i];//place your current data now to that at min index
            arr[i]=temp;//placing the smallest at your current
        }
    }
    public static void printArray(int[] arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
    public static void selectionSortUsingMinAndRecursion(int []arr, int first, int last){
        System.out.println(first+" "+last);
    //base case
        if(first==last){
            return;
        }
        int minIndex=first;

        for(int i=first+1;i<=last;i++){
            if(arr[i]<arr[minIndex]){
                minIndex=i;
            }
        }
        //when you will exit the loop..you will have the minimum value's index of the array.

        int temp= arr[minIndex];
        arr[minIndex]=arr[first];
        arr[first]=temp;

        selectionSortUsingMinAndRecursion(arr, first+1,last);
    }


    public static void changeItTo100(int n){
        n=100;
    }
    public static void main(String[] args) {
        int []arr={2,3,4,1,0};
        selectionSortUsingMinAndRecursion(arr,0,arr.length-1);
        printArray(arr);

//        int num=10;
//        changeItTo100(num);
//        System.out.println(num);
    }
}
