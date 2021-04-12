package com.upgrad.fop;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExmp {
    public static void main(String[] args) {
        TreeSet<Integer> bucket= new TreeSet<>();
        bucket.add(1);
        bucket.add(10);
        bucket.add(-11);
        bucket.add(2);

        System.out.println(bucket);

    }
}
//class MYComp implements Comparator<Integer>{
//
//}