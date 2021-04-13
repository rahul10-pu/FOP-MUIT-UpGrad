package com.upgrad.fop;

import java.util.HashSet;

public class PairSumToTarget {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,87,6,5,4};
        int targetSum=130;
        checkPairForSumOfTarget(arr,targetSum);
    }

    private static void checkPairForSumOfTarget(int[] arr, int targetSum) {
        HashSet<Integer> hs= new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int remaining=targetSum-arr[i];
            if(hs.contains(remaining)){
                System.out.println("We Got It");
                System.out.println(arr[i]+" "+remaining);
                return;
            }else {
                hs.add(arr[i]);
            }


        }
        System.out.println("Nhi hai mere pass ye");
    }
}
