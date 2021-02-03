package com.upgrad.fop;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListExmp {
    public static void main(String[] args) {
        //Syntax : ArrayList variable_name= new ArrayList();
        //add element in arraylist : variable_name.add(Object)

        //Syntax : LinkedList variable_name=new LinkedList();

//        ArrayList listOfNames=new ArrayList();
//        listOfNames.add("Pranjal");
//        listOfNames.add("Varun");
//        listOfNames.add("Vishal");
//        listOfNames.add(1,"ChandBabu");
//        //listOfNames.clear();//it will delete all the elements
//        if (listOfNames.contains("Varun")==true){
//            System.out.println("Varun hai isme..kuch add nhi karna");
//        }
//        System.out.println(listOfNames.indexOf("Varun"));
//        //listOfNames.lastIndexOf();
//        listOfNames.remove("Varun");
//        listOfNames.remove(1);
//        for(Object o: listOfNames){
//            String name=(String)o;
//            System.out.println(name);
//        }
        LinkedList listOfNames=new LinkedList();
        listOfNames.add("Pranjal");
        listOfNames.add("Varun");
        listOfNames.add("Vishal");
        listOfNames.add(1,"ChandBabu");
        //listOfNames.clear();//it will delete all the elements
        if (listOfNames.contains("Varun")==true){
            System.out.println("Varun hai isme..kuch add nhi karna");
        }
        System.out.println(listOfNames.indexOf("Varun"));
        //listOfNames.lastIndexOf();
        listOfNames.remove("Varun");
        listOfNames.remove(1);
        for(Object o: listOfNames){
            String name=(String)o;
            System.out.println(name);
        }

    }
}
//typesafe
