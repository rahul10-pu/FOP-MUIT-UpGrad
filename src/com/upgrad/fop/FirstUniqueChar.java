package com.upgrad.fop;

import java.util.HashMap;

public class FirstUniqueChar {

    public static void main(String[] args) {
        String inputStr="abcbadfeg";
        findFirstUniqueChar(inputStr);
    }

    private static void findFirstUniqueChar(String inputStr) {
        HashMap<Character,Integer> freq = new HashMap<>();
        for(int i=0; i < inputStr.length();i++ ){
            char c=inputStr.charAt(i);
            if(freq.get(c) != null && freq.get(c)>0 ){
                int count=freq.get(c)+1;
                freq.put(c,count);
            }else{
                freq.put(c,1);
            }
        }
        System.out.println(freq);
        for(int i=0; i < inputStr.length();i++ ){
            char c=inputStr.charAt(i);
            if( freq.get(c)==1 ){
                System.out.println("Got the First Unique Char:  "+c);
                break;
            }
        }
    }
}
