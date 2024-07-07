package dsa.LinkedListDemo3;

public class LinkedList {
    private Node head;
//    public void addAtLast(int x)
//    {
//        Node p=new Node(x);
//        if(head==null)
//        {
//            head=p;
//            return;
//        }
//
//        Node temp=head;
//        while (temp.getNext()!=null)
//        {
//            temp=temp.getNext();
//        }
//        temp.setNext(p);
//    }

    public void prepend(int x)
    {
        Node p=new Node(x);
        if(head==null)
        {
            head=p;
            return;
        }
        p.setNext(head);
        head=p;
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
//    public int searchNode(int x)
//    {
//        int count=1;
//        Node temp=head;
//        if(temp==null)
//            return 0;
//        else
//        {
//            while (temp!=null)
//            {
//                if(temp.getData()!=x) {
//                    count++;
//                    temp=temp.getNext();
//                }else
//                return count;
//            }
//        }
//        return -1;
//    }

    //Sir's method
    public int searchNode(int x)
    {
        if(head==null)
            return 0;
        Node temp=head;
        int pos=0;
        while (temp!=null)
        {
            pos++;
            if(temp.getData()==x)
            {
                return pos;
            }
            temp=temp.getNext();
        }
        return -1;
    }
}
