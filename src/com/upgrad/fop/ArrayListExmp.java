package com.upgrad.fop;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExmp {
    public static void main(String[] args) {
        //Syntax : ArrayList variable_name= new ArrayList();
        //TypeSafe Syntax : ArrayList<data_type> variable_name= new ArrayList<data_type>();
        //add element in arraylist : variable_name.add(Object)
// int, double - primitive data type

        //Syntax : LinkedList variable_name=new LinkedList();

        ArrayList<String> listOfNames=new ArrayList<String>();
        listOfNames.add("Pranjal");
        listOfNames.add("Varun");
        listOfNames.add("Vishal");
        listOfNames.add(2,"ChandBabu");
        listOfNames.remove(1);
        listOfNames.remove("Pranjal");
        String[] fixedListOfNames= new String[listOfNames.size()];
        fixedListOfNames= listOfNames.toArray(fixedListOfNames);
        //fixedListOfNames= listOfNames.toArray();//this will give error

        //adding Integer data
//        listOfNames.add(1);
        //listOfNames.clear();//it will delete all the elements
        if (listOfNames.contains("Varun")==true){
            System.out.println("Varun hai isme..kuch add nhi karna");
        }
//        System.out.println(listOfNames.indexOf("Varun"));
//        //listOfNames.lastIndexOf();
//        listOfNames.remove("Varun");
//        listOfNames.remove(1);
        for(Object o: listOfNames){
            String name=(String)o;    //typecast Object to String
            System.out.println(name);
        }
//        ArrayList<Integer> marks = new ArrayList<Integer>();
//        marks.add(100);
//        marks.add(109);
        LinkedList<String> listOfNamesss=new LinkedList<String>();
        listOfNamesss.add("Pranjal");
        listOfNamesss.add("Varun");
        listOfNamesss.add("Vishal");

//        listOfNames.add(1);
        listOfNamesss.add(1,"ChandBabu");
        //listOfNames.clear();//it will delete all the elements
        if (listOfNamesss.contains("Varun")==true){
            System.out.println("Varun hai isme..kuch add nhi karna");
        }
        System.out.println(listOfNamesss.indexOf("Varun"));
        //listOfNames.lastIndexOf();
        listOfNamesss.remove("Varun");
        listOfNamesss.remove(1);
        for(Object o: listOfNamesss){
            String name=(String)o;
            System.out.println(name);
        }

    }
}
//typesafe
