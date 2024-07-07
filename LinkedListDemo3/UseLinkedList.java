package dsa.LinkedListDemo3;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("Total node "+list.countNode());
//        list.addAtLast(10);
//        list.addAtLast(20);
//        list.addAtLast(30);
//        list.addAtLast(40);
//        list.addAtLast(50);
        list.prepend(10);
        list.prepend(20);
        list.prepend(30);
        list.prepend(40);
        list.prepend(50);
        list.printList();
        System.out.println("Total nodes "+list.countNode());
        System.out.println("Search ele "+list.searchNode(90));
    }
}
