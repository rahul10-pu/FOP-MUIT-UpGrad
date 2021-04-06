package com.upgrad.fop;

import java.util.Stack;

public class DuplicateParenthesisUsingStack {
    public static void main(String[] args) {
        String expression="(((1*2))+5)";
//        boolean result=isParenthesisDuplicate(expression);
//        System.out.println(result?"Duplicate":"Not Duplicate");
        String result=isParenthesisDuplicate(expression)?"Duplicate":"Not Duplicate";
        System.out.println(result);
    }

    private static boolean isParenthesisDuplicate(String expression) {
        char[] expcharArray= expression.toCharArray();

        Stack<Character> stack= new Stack<>();

        for(char element: expcharArray){
            if(element==')'){
                char temp=stack.pop();

                int elementInsideIt=0;
                while(temp!='('){
                    elementInsideIt++;
                    temp=stack.pop();
                }
                if(elementInsideIt<1){
                    return true;
                }
            }else{
                stack.push(element);
            }

        }
        return false;
    }
}

// epression?statement1:statement2;
/*
if(expression==true){
    statement1;
}else{
    statement2;
}

*/