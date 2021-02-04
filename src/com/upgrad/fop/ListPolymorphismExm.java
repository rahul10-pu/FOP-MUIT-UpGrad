package com.upgrad.fop;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPolymorphismExm {
    public static void main(String[] args) {
        List<String> listOfNames= new ArrayList<String>();
        listOfNames.add("ABS");
        listOfNames.add("AWEGwegd");
        listOfNames.add("Aargw");
        listOfNames.add("AawegWEG");
        listOfNames.add("ABGwEG");

        List<String> listOfCity = new LinkedList<String>();
        listOfCity.add("awgserw");
        listOfCity.add("awgshgshw");
        listOfCity.add("awgaerhw");
        listOfCity.add("awgaerhaw");
        listOfCity.add("azrhwgw");
        printValues(listOfCity);
        printValues(listOfNames);

    }
    static void printValues(List<String> input){
        for(String item:input){
            System.out.println(item);
        }
    }
}
