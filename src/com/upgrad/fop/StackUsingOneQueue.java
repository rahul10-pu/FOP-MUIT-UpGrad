package com.upgrad.fop;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingOneQueue {
    private int arr[];
    private int top;
    private int capacity;
    private int min;


    private Queue<Integer> q1 = new LinkedList<Integer>();
    private Queue<Integer> q2 = new LinkedList<Integer>();
    private static int size;



    private Queue<Integer> q = new LinkedList<Integer>();
    private static int cap;

    // Constructor to initialize the stack
    StackUsingOneQueue(int cap)
    {
        this.cap=cap;
    }
    int getMin(){
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }else{
            return min;
        }
        return -1;
    }
    // Utility function to add an element `x` to the stack
    public void push(int x)
    {
        if(q.size()==cap){
            System.out.println("Error: The Stack is Full"+q.size());
            return;
        }
       q.add(x);
//        System.out.println("Current Size "+q.size()+" and Input Element: "+x);
       for(int i=1; i< q.size();i++){
           int temp=q.remove();
           q.add(temp);
       }
    }

    // Utility function to pop a top element from the stack
    public int pop(){
       if(q.isEmpty()){
           System.out.println("Error: The Stack is Empty");
           return -1;
       }
        return q.remove();
    }

    // Utility function to return the top element of the stack
    public int peek()
    {
        if(q.isEmpty()){
            System.out.println("Error: The Stack is Empty");
            return -1;
        }
        return q.peek();
    }

    // Utility function to return the size of the stack
    public int size() {
        return q.size();
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return q.isEmpty();               // or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return cap == q.size();     // or return size() == capacity;
    }
    public static void main (String[] args)
    {
        StackUsingOneQueue stack = new StackUsingOneQueue(10);
//        stack.push(5);
//        System.out.println(stack.getMin());
//        stack.push(10);
//        System.out.println(stack.getMin());
//        stack.push(4);
//        System.out.println(stack.peek());
//        System.out.println(stack.getMin());
//        stack.push(3);
//        System.out.println(stack.getMin());
//        stack.push(2);
//        System.out.println(stack.getMin());
//        stack.push(1);
//        System.out.println(stack.getMin());
//        stack.push(40);
//        System.out.println(stack.peek());
//        System.out.println(stack.getMin());


        stack.push(1);      // inserting 1 in the stack
        stack.push(2);      // inserting 2 in the stack

        System.out.println(stack.pop());        // removing the top element (2)
        System.out.println(stack.pop());

        stack.push(3);      // inserting 3 in the stack

//        System.out.println("The top element is " + stack.peek());//peek is top
        System.out.println("The stack size is " + stack.size());

        System.out.println(stack.pop());       // removing the top element (3)
////
//        // check if the stack is empty
//        if (stack.isEmpty()) {
//            System.out.println("The stack is empty");
//        }
//        else {
//            System.out.println("The stack is not empty");
//        }
//        stack.push(1);
//        stack.push(2);
//        System.out.println("POP: "+stack.pop());
//
//        stack.push(3);
//        System.out.println("The stack size is " + stack.size());
    }
}


