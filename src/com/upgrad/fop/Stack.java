package com.upgrad.fop;

class Stack
{
    private int arr[];
    private int top;
    private int capacity;
    private int min;

    // Constructor to initialize the stack
    Stack(int size)
    {
        arr = new int[size];
        capacity = size;
        top = -1;
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
        if (isFull())
        {
            System.out.println("Overflow\nProgram Terminated\n");
            System.exit(1);
        }
        if (isEmpty())
        {
            min=x;
            arr[++top] = x;
           return;
        }
        System.out.println("Inserting " + x);
//        arr[++top] = x;
        if (x<min){
            arr[++top] = 2*x-min;
            min=x;
        }else{
            arr[++top] = x;
        }
    }

    // Utility function to pop a top element from the stack
    public int pop()
    {
        // check for stack underflow
        if (isEmpty())
        {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(1);
        }

        System.out.println("Removing " + peek());

        // decrease stack size by 1 and (optionally) return the popped element
//        return arr[top--];
        if(arr[top]<min){
            min=2*min-arr[top];
            return arr[top--];
        }else{
            return arr[top--];
        }
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
        return top + 1;
    }

    // Utility function to check if the stack is empty or not
    public Boolean isEmpty()
    {
        return top == -1;               // or return size() == 0;
    }

    // Utility function to check if the stack is full or not
    public Boolean isFull() {
        return top == capacity - 1;     // or return size() == capacity;
    }
}

class Main
{
    public static void main (String[] args)
    {
        Stack stack = new Stack(10);
        stack.push(5);
        System.out.println(stack.getMin());
        stack.push(10);
        System.out.println(stack.getMin());
        stack.push(4);
        System.out.println(stack.peek());
        System.out.println(stack.getMin());
        stack.push(3);
        System.out.println(stack.getMin());
        stack.push(2);
        System.out.println(stack.getMin());
        stack.push(1);
        System.out.println(stack.getMin());
        stack.push(40);
        System.out.println(stack.peek());
        System.out.println(stack.getMin());


//        stack.push(1);      // inserting 1 in the stack
//        stack.push(2);      // inserting 2 in the stack
//
//        stack.pop();        // removing the top element (2)
//        stack.pop();        // removing the top element (1)
//
//        stack.push(3);      // inserting 3 in the stack
//
//        System.out.println("The top element is " + stack.peek());//peek is top
//        System.out.println("The stack size is " + stack.size());
//
//        stack.pop();        // removing the top element (3)
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

