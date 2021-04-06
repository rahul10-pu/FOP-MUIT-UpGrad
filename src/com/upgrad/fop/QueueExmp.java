package com.upgrad.fop;
import java.util.LinkedList;
import java.util.Queue;
public class QueueExmp {
    public static void main(String[] args) {
        Queue<Integer> todo = new LinkedList<>();
        todo.add(1222);//first element inserted in the queue
        todo.add(12);
        todo.add(124);
        todo.add(14);
        todo.add(11);
        System.out.println(todo.peek());
        todo.remove();
        System.out.println(todo.peek());//
        //iterator



    }
}

