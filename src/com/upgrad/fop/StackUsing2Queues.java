package com.upgrad.fop;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues
{
    private int arr[];
    private int top;
    private int capacity;
    private int min;


    private Queue<Integer> q1 = new LinkedList<Integer>();
    private Queue<Integer> q2 = new LinkedList<Integer>();
    private static int size;
    private static int cap;

    // Constructor to initialize the stack
    StackUsing2Queues(int cap)
    {
        size=0;
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
        if(size==cap+1){
            System.out.println("your stack got full..bas kar de ab");
            return;
        }
      q2.add(x);
      size++;
    }

    // Utility function to pop a top element from the stack
    public int pop(){
    int temp=0;
    if(q2.isEmpty()){
        return -1;
    }
    while (!q2.isEmpty()){
           temp=q2.remove();
           if(q2.isEmpty()){
               continue;
           }
           q1.add(temp);
       }
       Queue<Integer> t=q2;
       q2=q1;
       q1=t;
       size--;
       return temp;
    }

    // Utility function to return the top element of the stack
    public int peek()
    {


        if (!isEmpty()) {
//            return arr[top];
            if(arr[top]<min){
                return  min;
            }else{
                return arr[top];
            }
        }
        else {
            System.exit(1);
        }

        return -1;
    }

    // Utility function to return the size of the stack
    public int size() {
        return size;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return q2.isEmpty();               // or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
    public static void main (String[] args)
    {
        StackUsing2Queues stack = new StackUsing2Queues(10);
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
        System.out.println(stack.pop());        // removing the top element (1)

        stack.push(3);      // inserting 3 in the stack

//        System.out.println("The top element is " + stack.peek());//peek is top
        System.out.println("The stack size is " + stack.size());

        System.out.println(stack.pop());       // removing the top element (3)
//
//        // check if the stack is empty
//        if (stack.isEmpty()) {
//            System.out.println("The stack is empty");
//        }
//        else {
//            System.out.println("The stack is not empty");
//        }
    }
}


