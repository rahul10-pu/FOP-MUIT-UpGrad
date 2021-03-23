package com.upgrad.fop;

import java.util.Stack;

public class StackUtil {
    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();

        //iterate over the char of the String
        for(int i=0;i<input.length();i++){
            System.out.println("We are processing:  "+ input.charAt(i));
            //now check for the opening bracket
            //if found then push it to the stack
            if(input.charAt(i)=='[' || input.charAt(i)=='{' || input.charAt(i)=='(' ){
                stack.push(input.charAt(i));
            }
            //if found closing bracket, we need to pop...but before that simply check for stack.isEmpty
            if(input.charAt(i)==']' || input.charAt(i)=='}' || input.charAt(i)==')'){
                if(stack.isEmpty()){
                    return  false;
                }
                Character top= stack.pop();
                Character in=input.charAt(i);
                if((top == '[' && in !=']') || (top == '{' && in !='}') || (top == '(' && in !=')')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String input="[()(}){()}]";
        if(isBalanced(input)){
            System.out.println("Ok..it's balanced");
        }else{
            System.out.println("It's not balanced");
        }
//        Stack<Integer> s= new Stack<>();
//        s.push(100);
//        s.pop();
//        s.pop();
//
//        s.push(20);
//        System.out.println(s.peek());
//        System.out.println(s.isEmpty());

    }
}
