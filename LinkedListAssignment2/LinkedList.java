package dsa.LinkedListAssignment2;

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

    public void addAtPos(int data, int idx)
    {
        Node p=new Node(data);
        if(head==null && idx!=0)
        {
            throw new LinkedListException("Invalid index");
        }
        Node temp=head;
        int pos=0;
        if(idx==0)
        {
            p.setNext(head);
            head=p;
            return;
        }
            while (temp != null ) {
                if (pos == idx-1) {
                    p.setNext(temp.getNext());
                    temp.setNext(p);
                }
                temp=temp.getNext();
                pos++;
            }
            if(pos<idx)
            {
                throw new LinkedListException("Invalid index ");
            }
    }

    public void insert(int data)
    {
        Node p=new Node(data);
        if(head==null)
        {
            head.setNext(p);
            return;
        }
        Node temp=head;
        while (temp!=null)
        {
            if(temp.getData()>=data)
            {
                p.setNext(temp);
                temp=p;
                break;
            }
            else if(data>=temp.getData() && temp.getNext().getData()>=data)
            {
                p.setNext(temp.getNext());
                temp.setNext(p);
                break;
            }
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
}
