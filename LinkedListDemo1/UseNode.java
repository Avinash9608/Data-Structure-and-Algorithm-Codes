package dsa.LinkedListDemo1;

public class UseNode {
    public static void main(String[] args) {
        Node head;
        head=new Node();
        head.data=10;

        Node sec=new Node();
        sec.data=20;
        head.next=sec;

        Node third=new Node();
        third.data=30;
        sec.next=third;

        Node fourth=new Node();
        fourth.data=40;
        third.next=fourth;

        Node p=head;
        while (p!=null)
        {
            System.out.println(p.data);
            p=p.next;
        }
    }
}
