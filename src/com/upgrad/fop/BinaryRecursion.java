package com.upgrad.fop;

public class BinaryRecursion {
    // binarysearch - (arr, left, right, number)
    // calculate mid,
    // BASE : 1. arr[mid]==number => return mid
    // if not => right>=left && left<arr.length-1 => return -1
    int binarySrearch(int arr[], int left,int right,int input){
        //if it's true then go for searching, otherwise we don't have that...return -1
        System.out.println("binarySrearch("+left+" , "+right+")");
        if(right>=left && left<=arr.length-1){
            int mid=left+(right-left)/2;
            System.out.println("mid = "+mid);
            if(arr[mid]==input){
                return mid;
            }
            if(arr[mid]>input){
                return binarySrearch(arr,left, mid-1,input);
            }else{
                return binarySrearch(arr,mid+1,right,input);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BinaryRecursion br= new BinaryRecursion();
        int arr[]={2,3,22,44,55,66};
        int input= 2;
        int index= br.binarySrearch(arr, 0,arr.length-1,input);
        if(index==-1){
            System.out.println(input+" Not Found");
        }else{
            System.out.println(input+" Found at index "+index);
        }
    }

}
