package com.upgrad.fop;

import java.util.Stack;

public class KthLargestElementInStack {
    private static Stack<Integer> Sort(Stack<Integer> stack) {
        Stack<Integer> tempStack=new Stack<>();
        while(stack.isEmpty()==false){
            int temp=stack.pop();
            System.out.println("first pop this: "+temp);
            //if temp is smaller than temp_stack.peek() then push all the element in original stack
            while(tempStack.isEmpty()==false && temp<tempStack.peek() ){
                stack.push(tempStack.pop());
            }
            //if above cpndition is not the case i.e, temp> temp_stack.peek()....then simply push the temp in temp_stack.
            System.out.println("Pushing this in tempStack: "+temp);
            tempStack.push(temp);
        }
        return tempStack;
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(0);
        stack.push(5);
        stack.push(2);
        System.out.println(stack);

        Stack<Integer> sortedStack=Sort(stack);
        System.out.println("After sorting of stack:");
        System.out.println(sortedStack);
    }


}
