package com.upgrad.fop;

import java.util.HashSet;

public class ContiguousArray {
    public static void main(String[] args) {
        int inputArr[]={4,5,8,9,7,6,7,3,-1};
        System.out.println(isArrayContiguous(inputArr));
    }

    private static boolean isArrayContiguous(int[] inputArr) {
        HashSet<Integer> storeDistictElement=new HashSet<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<inputArr.length;i++){
            storeDistictElement.add(inputArr[i]);
            min=Math.min(min,inputArr[i]);
            max=Math.max(max,inputArr[i]);
        }
        System.out.println(storeDistictElement);
        System.out.println(min);
        System.out.println(max);
        //1. Check there must me n number of distinct elements
        // where n = max-min+1
        int n=max-min+1;
        if(n!=storeDistictElement.size()){
            System.out.println("n != storeDistictElement.size()");
            return false;
        }
        while(storeDistictElement.contains(min)){
            min++;
        }
        System.out.println(min);
        if(min-1 != max){
            System.out.println("min-1 != max");
            return false;
        }

        return true;
    }
}
