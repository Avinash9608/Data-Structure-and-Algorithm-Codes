package dsa.problemsolving.linkedListproblem;

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
    public int searchNode(int x)
    {
        int count=1;
        Node temp=head;
        if(temp==null)
            return 0;
        else
        {
            while (temp!=null)
            {
                if(temp.getData()!=x) {
                    count++;
                    temp=temp.getNext();
                }else
                return count;
            }
        }
        return -1;
    }

    public void reverseList()
    {
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while (temp!=null)
        {
            int x=temp.getData();
            st.push(x);
            temp=temp.getNext();
        }
        while (!st.empty())
        {
            int x=st.pop();
            System.out.println(x);
        }
    }

    public void addAtPos(int x, int pos)
    {
        if(pos<0 || pos>countNode())
        {
            throw new IllegalArgumentException("Invalid position ");
        }
        Node p=new Node(x);
        if(pos==0)
        {
            p.setNext(head);
            head=p;
            return;
        }
        int i=0;
        Node temp=head;
        while (i<pos-1)
        {
            i++;
            temp=temp.getNext();
        }
        p.setNext(temp.getNext());
        temp.setNext(p);
    }

    public void insert(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        if(x<head.getData())
        {
            p.setNext(head);
            head=p;
            return;
        }
        Node temp=head, prev=null;
        while (temp!=null && temp.getData()<x)
        {
            prev=temp;
            temp=temp.getNext();
        }
        if(temp==null)
        {
            prev.setNext(p);
        }else {
            prev.setNext(p);
            p.setNext(temp);
        }
    }
}
