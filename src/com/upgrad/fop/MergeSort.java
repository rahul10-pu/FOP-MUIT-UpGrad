package com.upgrad.fop;

public class MergeSort {
    public static void main(String[] args) {
//        int []arr1={0,4,5,18};
//        int []arr2={1,3,10,100};
//        int []arr3= new int[arr1.length+arr2.length];
//        merge2SortedArray(arr1,arr2,arr3);
        int []arr={12,41,5,18,22,1,77,3};
        int leftEnd=0;
        int rightEnd=arr.length-1;
        mergeSort(arr, leftEnd,rightEnd);
        printArray(arr);
    }
    public static void mergeSort(int []arr, int leftEnd, int rightEnd){
        if(leftEnd<rightEnd) {
            int mid = (leftEnd + rightEnd) / 2;
            //divide the array and go for sorting respectively
            mergeSort(arr, leftEnd, mid);
            mergeSort(arr, mid + 1, rightEnd);
            //merge
            merge(arr,leftEnd,mid,rightEnd);
        }
    }

    public static void merge(int []arr, int left, int mid, int right){
        //seprate the array in 2 parts and get their length
        int n1=mid-left+1;
        int n2=right-mid;

        //temp arrays
        int leftPart[]= new int[n1];
        int rightPart[]=new int[n2];

        //copy data from original array to temp array
        for(int i=0 ; i < n1 ; i++){
            leftPart[i]=arr[left+i];
        }
        for(int j=0;j<n2;j++){
            rightPart[j]=arr[mid+1+j];
        }

        //Now we will merge the leftpart and the rightpart in sorted manner

        int i=0,j=0;
        int k=left;

        while(i<n1 && j<n2 ){
            if(leftPart[i]<=rightPart[j]){
                arr[k]=leftPart[i];
                i++;
            }else{
                arr[k]=rightPart[j];
                j++;
            }
            k++;

        }
        //Copy the remaining element of leftpart to the Original Array
        while(i<n1){
            arr[k]=leftPart[i];
            i++;
            k++;
        }
        //Copy the remaining element of the rightPart to the original array
        while(j<n2){
            arr[k]=rightPart[j];
            j++;
            k++;
        }


    }
    public static void merge2SortedArray(int []arr1,int []arr2,int []arr3){

    }


    public static void printArray(int[] arr){
        for(int a: arr){
            System.out.print(a+" ");
        }
    }
}
