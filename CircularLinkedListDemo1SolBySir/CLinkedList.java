package dsa.CircularLinkedListDemo1SolBySir;

import java.util.NoSuchElementException;

public class CLinkedList {
    private Node head;
    public void addAtLast(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while (temp.getNext()!=head)
        {
            temp=temp.getNext();
        }
        temp.setNext(p);
        p.setNext(head);
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }while (temp!=head);
    }

    // This method is designed by Avinash
//    public void prepend(int x)
//    {
//        Node p=new Node(x);
//        if(head==null)
//        {
//            head=p;
//            p.setNext(head);
//        }
//        Node temp=head;
//        while (temp.getNext()!=head)
//        {
//            temp=temp.getNext();
//        }
//        p.setNext(head);
//        head=p;
//        temp.setNext(head);
//    }


    // This method is designed by Avinash
//    public void removeLast()
//    {
//        if(head==null)
//        {
//            System.out.println("Empty List ");
//            return;
//        }
//        if(head.getNext()==head)
//        {
//            head=null;
//            return;
//        }
//        Node temp=head ,prev=null;
//        while (temp.getNext()!=head)
//        {
//            prev=temp;
//            temp=temp.getNext();
//        }
//        prev.setNext(head);
//
//    }

    public void prepend(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            p.setNext(p);
            return;
        }
        Node temp=head;
        while (temp.getNext()!=head)
        {
            temp=temp.getNext();
        }
        p.setNext(head);
        head=p;
        temp.setNext(p);
    }

    public int removeFirst()
    {
        if(head==null)
        {
            throw new NoSuchElementException("List is empty ");
        }
        int x=head.getData();
        if(head.getNext()==head)
        {
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext()!=head)
        {
            temp=temp.getNext();
        }
        head=head.getNext();
        temp.setNext(head);
        return x;
    }

    public int removeLast() {
        if (head == null) {
            throw new NoSuchElementException("List is Empty ");
        }
        int x;
        if (head.getNext() == head) {
            x = head.getData();
            head = null;
            return x;
        }
        Node temp = head, prev = null;
        while (temp.getNext() != head) {
            prev = temp;
            temp = temp.getNext();
        }
        x=temp.getData();
        prev.setNext(head);
        return x;
    }

    public int removeLastv2()
    {
        if(head==null)
        {
            throw new NoSuchElementException("List is Empty ");
        }
        int x;
        if(head.getNext()==head)
        {
            x=head.getData();
            head=null;
            return x;
        }
        Node temp=head;
        while (temp.getNext().getNext()!=head)
        {
            temp=temp.getNext();
        }
        x=temp.getNext().getData();
        temp.setNext(head);
        return x;
    }

    public boolean removeData(int x)
    {
        if(head==null)
        {
            throw new NoSuchElementException("List is Empty ");
        }
        if(head.getNext()==head)
        {
            if(head.getNext()==head)
            {
                head=null;
                return true;
            }
            Node temp=head;
            while (temp.getNext()!=head)
            {
                temp=temp.getNext();
            }
            head=head.getNext();
            temp.setNext(head);
            return true;
        }
        Node temp=head, prev=null;
        //use logic
        return true;
    }
}
