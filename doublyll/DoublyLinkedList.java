package dsa.doublyll;

import java.util.NoSuchElementException;

public class DoublyLinkedList {
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
        p.setPrev(temp);
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("Empty List ");
            return;
        }
        Node temp=head, prev=null;
        System.out.println("Traversing fwd.. ");
        while (temp!=null)
        {
            System.out.println(temp.getData());
            prev=temp;
            temp=temp.getNext();
        }
//        System.out.println("Traversing bckwd..");
//        while (prev!=null)
//        {
//            System.out.println(prev.getData());
//            prev=prev.getPrev();
//        }
    }

    public void prepand(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        p.setNext(head);
        head.setPrev(p);
        head=p;
    }

//    public int removeFirst()
//    {
//        if(head==null)
//        {
//            throw new NoSuchElementException("List is empty ");
//        }
//        int x=head.getData();
//        if(head.getNext()==null)
//        {
//            head=null;
//        }else
//        {
//            head=head.getNext();
//            head.setPrev(null);
//        }
//        return x;
//    }
public int removeFirst()
{
    if(head==null)
    {
        throw new NoSuchElementException("List is empty ");
    }
   int x=head.getData();
    head=head.getNext();
    if(head!=null)
        head.setPrev(null);
    return x;
}

public int removeLast()
{
    if(head==null)
    {
        throw new NoSuchElementException("List is Empty ");
    }
    int x=head.getData();
    if(head.getNext()==null)
    {
        head=null;
        return x;
    }
    Node temp=head;
    while (temp.getNext()!=null)
    {
        temp=temp.getNext();
    }
    x=temp.getData();
    temp.getPrev().setNext(null);
    return x;
}

    public boolean removeData(int x)
    {
      if(head==null)
          throw new NoSuchElementException("Empty List ");
      if(head.getData()==x)
      {
          if(head.getNext()==null)
          {
              head=null;
              return true;
          }
          head=head.getNext();
          head.setPrev(null);
          return true;
      }
      Node temp=head;
      while (temp!=null && temp.getData()!=x)
      {
          temp=temp.getNext();
      }
      if(temp==null)
          return false;
      temp.getPrev().setNext(temp.getNext());
      if(temp.getNext()!=null)
      {
          temp.getNext().setPrev(temp.getPrev());
      }
      return true;
    }

}
