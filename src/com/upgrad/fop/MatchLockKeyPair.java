package com.upgrad.fop;

import java.util.HashMap;

public class MatchLockKeyPair {
    public static void main(String[] args) {
        int locks[]={1,2,3,4,5,3,1,2,3,3,4};
        int keys[]={3,2,4,1,1,2,3,4,5};
        matchLockAndKey(locks,keys);
    }

    private static void matchLockAndKey(int[] locks, int[] keys) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<locks.length;i++){
            ans.put(locks[i],i);
        }
        //2nd part
        for(int i=0;i<keys.length;i++){
           if(ans.containsKey(keys[i])==false){
               System.out.println("Matching Not Found");
               return;
           }
        }
        System.out.println("Matching Found");
    }
}
