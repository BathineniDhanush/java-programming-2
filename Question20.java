package com.assignment2;
import org.w3c.dom.Node;

class linkedl{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    void printNfromLast(int n){
        int len=0;
        Node temp= head;
        while (temp!=null){
            temp=temp.next;
            len++;
        }
        if(len<n)
            return;
        temp=head;
        for (int i=1;i<n;i++)
            temp=temp.next;
        System.out.println(temp.data);
    }
}

public class Question20 {
    public static void main(String[] args) {
        linkedl list=new linkedl();
        list.push(100);
        list.push(200);
        list.push(300);
        list.push(420);
        list.printNfromLast(1);
    }
}

