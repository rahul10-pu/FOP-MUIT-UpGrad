package com.upgrad.fop;
import java.util.HashMap;
public class HashMapAndHashTable {
    public static void main(String[] args) {
//        Hashtable<String,Integer> phonebook = new Hashtable<>();
//        phonebook.put("Sagar Verma",99999);
//        phonebook.put("Sagar Verma",12343);
//        phonebook.put("Pranjal",23451);
//        phonebook.put("Krishna", 34253);
//        System.out.println(phonebook.get("Sagar Verma"));
//        System.out.println(phonebook.containsKey("Sagar"));
//        System.out.println(phonebook.values());
        HashMap<Integer,Integer> pairs = new HashMap<>();
        int[][] arr ={
                {0,1},
                {10,2},
                {2,3},
                {1,0},
                {3,3},
        };
        boolean haveSymmetric=false;
        for(int i=0;i<arr.length;i++){

            int k,v;
            k=arr[i][0];
            v=arr[i][1];
            System.out.println("Checking for:   "+k+" "+v);
            Integer value = pairs.get(v);
            if(value!= null && value == k){
                System.out.println("Matrix contains the sysmmetric pair");
                haveSymmetric=true;
                System.out.println(k+" "+v);
                break;
            }else{
                System.out.println("Inserting for:   "+k+" "+v);
                pairs.put(k, v);
            }
        }
        System.out.println(pairs);
        if(haveSymmetric==false){
            System.out.println("Matrix dont have the sysmmetric pair");
        }



    }
}
