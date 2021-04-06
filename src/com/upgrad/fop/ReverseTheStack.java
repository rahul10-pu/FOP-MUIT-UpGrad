package com.upgrad.fop;
import java.util.Stack;
public class ReverseTheStack {
    static Stack<Integer> stack= new Stack<>();
    static Stack<Integer> temp_stack= new Stack<>();
    public static void reverse(){
        //base condition
        if(stack.isEmpty()){
            //swap temp_stack and stack(original)
            Stack<Integer> ts = stack;
            stack=temp_stack;
            temp_stack=ts;
            return;
        }
        Integer temp=stack.pop();
        temp_stack.push(temp);
        reverse();


    }
//    public static void insertAtBottom(int x){}

    public static void main(String[] args) {
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
        // in stack [1,2,3,4]
        for(int i=1;i<=4;i++){
            stack.push(i);
        }

        System.out.println(stack);
        reverse();
        System.out.println("After reversing the stack, below is the output:");
        System.out.println(stack);

    }
}
