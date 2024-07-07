package dsa.CircularLinkedListDemo1;

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

    public void prepend(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            p.setNext(head);
        }
        Node temp=head;
        while (temp.getNext()!=head)
        {
            temp=temp.getNext();
        }
        p.setNext(head);
        head=p;
        temp.setNext(head);
    }

    public void removeLast()
    {
        if(head==null)
        {
            System.out.println("Empty List ");
            return;
        }
        if(head.getNext()==head)
        {
            head=null;
            return;
        }
        Node temp=head ,prev=null;
        while (temp.getNext()!=head)
        {
            prev=temp;
            temp=temp.getNext();
        }
        prev.setNext(head);

    }
}
