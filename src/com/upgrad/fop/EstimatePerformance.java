package com.upgrad.fop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EstimatePerformance {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<Integer>();
        for(int i=0;i<1000;i++){
            list1.add(i);
        }

        List<Integer> list2=new LinkedList<Integer>();
        for(int i=0;i<1000;i++){
            list2.add(i);
        }
        final long time1=estimatePerformance(list1);//time taken by arraylist
        final long time2=estimatePerformance(list2);//time taken by linked list
        System.out.println("Time taken by Array list: "+time1);
        System.out.println("Time taken by Linked list:  "+time2);
        System.out.println(time1-time2);
        if(time1>time2){
            System.out.println("Array list is taking more time");
        }else {
            System.out.println("Linked list is taking more time");
        }
    }
    public static long estimatePerformance(List<Integer> list){
        final long start= System.nanoTime();
        for(int i=0;i<1000;i++){
            //some operation
            int size=list.size();
            list.get(size/2);
        }
        final long end=System.nanoTime();
        return end-start;
    }

}
