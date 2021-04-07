package com.upgrad.fop;
import java.util.Hashtable;
public class HashTableExmp {
    public static void main(String[] args) {
        Hashtable<String,Integer> phonebook = new Hashtable<>();
        phonebook.put("Sagar Verma",99999);
        phonebook.put("Sagar Verma",12343);
        phonebook.put("Pranjal",23451);
        phonebook.put("Krishna", 34253);
        System.out.println(phonebook.get("Sagar Verma"));
        System.out.println(phonebook.containsKey("Sagar"));
        System.out.println(phonebook.values());


    }
}
