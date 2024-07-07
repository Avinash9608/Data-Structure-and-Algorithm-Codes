package dsa.LinkedListAssignment3;

import java.util.Stack;

public class LinkedList {
    private Node head;
    public void addAtLast(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }

        Node temp=head;
        while (temp.getNext()!=null)
        {
            temp=temp.getNext();
        }
        temp.setNext(p);
    }

    public void printList()
    {
        if(head==null)
        {
            System.out.println("Empty list ");
            return;
        }
        Node temp=head;
        while (temp!=null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }

    public int countNode()
    {
        int count=0;
        Node temp=head;
        while (temp!=null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }

    public void reverse()
    {
        Stack<Integer> stack=new Stack<>();
        Node temp=head;
        if (head==null) {
            System.out.println("Empty list ");
            return;
        }
        while (temp!=null)
        {
            stack.push(temp.getData());
            temp=temp.getNext();
        }
        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
