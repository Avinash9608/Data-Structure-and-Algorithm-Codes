package dsa.LinkedListAssignment4;

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

//    public void removeFirst()
//    {
//        if(head==null)
//        {
//            System.out.println("List is empty ");
//        }
//        if(head.getNext()==null)
//        {
//            head=null;
//            return;
//        }
//        head=head.getNext();
//    }

    //Modified code removeFirst()
    public void removeFirst()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
        }
        head=head.getNext();
    }

    //This is using 2 pointer approch
//    public void removeLast()
//    {
//        if(head==null)
//        {
//            System.out.println("List is empty ");
//            return;
//        }
//        if(head.getNext()==null)
//        {
//            head=null;
//            return;
//        }
//        Node temp=head, prev=null;
//        while (temp.getNext()!=null)
//        {
//            prev=temp;
//            temp=temp.getNext();
//        }
//        prev.setNext(null);
//    }

    // Using Single Pointer or Reference
    public void removeLast2()
    {
        if(head==null)
        {
            System.out.println("List is empty ");
            return;
        }
        if(head.getNext()==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while (temp.getNext().getNext()!=null)
        {
            temp=temp.getNext();
        }
        temp.setNext(null);
    }

    public void remove(int data)
    {
        try {
            if (head == null) {
                System.out.println("List is Empty ");
                return;
            } else if (head.getNext() == null && head.getData() == data) {
                head = null;
            } else if (head.getData() == data) {
                head = head.getNext();
            } else {
                Node temp = head, prev = null;
                while (temp != null && temp.getData() != data) {
                    prev = temp;
                    temp = temp.getNext();
                }
                prev.setNext(temp.getNext());
            }
        }catch (NullPointerException nlp)
        {
            System.out.println("Invalid input, Data not match ");
        }
    }

    public void deleteNthNodeFromLast(int nth) {
        if (head == null) {
            System.out.println("Empty node ");
            return;
        }
        Node temp = head, prev = null;
        int remidx = countNode() - nth;
        int tempidx = 0;
        if (remidx < 0) {
            System.out.println("Invalid idx ");
            return;
        }
        if (remidx == 0) {
            head = head.getNext();
            return;
        } else {
            while (temp != null && tempidx != remidx) {
                prev = temp;
                temp = temp.getNext();
                tempidx++;
            }
            prev.setNext(temp.getNext());
        }
    }
}
