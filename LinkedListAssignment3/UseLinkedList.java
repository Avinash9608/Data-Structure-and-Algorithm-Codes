package dsa.LinkedListAssignment3;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("Total node "+list.countNode());
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);
        System.out.println("Before Reverse Calling ");
        list.printList();
        System.out.println("Total nodes after insertion "+list.countNode());
        System.out.println("After Reverse Calling ");
        list.reverse();
//        list.printList();
    }
}
