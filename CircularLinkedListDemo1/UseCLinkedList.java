package dsa.CircularLinkedListDemo1;

public class UseCLinkedList {
    public static void main(String[] args) {
        CLinkedList clist=new CLinkedList();
        clist.addAtLast(10);
        clist.addAtLast(20);
        clist.addAtLast(30);
        clist.addAtLast(40);
        clist.addAtLast(50);
        clist.printList();
        System.out.println("After appending ");
        clist.prepend(11);
        clist.prepend(22);
        clist.printList();
        System.out.println("Remove last ");
        clist.removeLast();
        clist.removeLast();
        clist.printList();
    }
}
