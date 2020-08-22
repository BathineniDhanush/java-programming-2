package com.assignment2;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class Question18 {
    static Queue<Integer> queue;
    static void Print()
    {
        while (!queue.isEmpty())
        {
            System.out.print(queue.peek() + " ");
            queue.remove();
        }
    }
    static Queue<Integer> reverseQueue(Queue<Integer> q)
    {
        if (q.isEmpty())
            return q;
        int data = q.peek();
        q.remove();
        q = reverseQueue(q);
        q.add(data);
        return q;
    }
    public static void main(String args[])
    {
        queue = new LinkedList<Integer>();
        queue.add(27);
        queue.add(45);
        queue.add(87);
        queue.add(2);
        queue.add(26);
        queue.add(39);
        queue.add(54);
        queue.add(58);
        queue.add(590);
        queue.add(10);
        queue = reverseQueue(queue);
        Print();
    }
}
