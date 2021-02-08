package com.upgrad.fop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListPolymorphismExm {
    public static void main(String[] args) {
        List<String> listOfNames= new ArrayList<String>();
        listOfNames.add("aaaaa");
        listOfNames.add("bbbb");
        listOfNames.add("cccc");
        listOfNames.add("dddd");
        listOfNames.add("eeee");

        List<String> listOfCity = new LinkedList<String>();
        listOfCity.add("111");
        listOfCity.add("2222");
        listOfCity.add("3333");
        listOfCity.add("4444");
        listOfCity.add("555");
        printValues(listOfCity);
        printValues(listOfNames);

    }
    static void printValues(List<String> input){
        System.out.println("In printValues function");
        System.out.println("Printing element in forward direction");
        int count=0;
        ListIterator fwdIT=input.listIterator();
        while(fwdIT.hasNext()){
            System.out.println(count);
           count++;
        }
        System.out.println("Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        System.out.println(count);
        while(fwdIT.hasPrevious()){
            System.out.println(fwdIT.previous());
        }

//        System.out.println("Printing element in backward direction");
//        ListIterator bkwdIT = input.listIterator(input.size());
//        while(bkwdIT.hasPrevious()){
//            System.out.println(bkwdIT.previous());
//        }

    }
}
