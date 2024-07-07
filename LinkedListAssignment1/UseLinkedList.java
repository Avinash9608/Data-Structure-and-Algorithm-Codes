package dsa.LinkedListAssignment1;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("Total node "+list.countNode());
        list.addAtLast(10);
        list.addAtLast(20);
        list.addAtLast(30);
        list.addAtLast(40);
        list.addAtLast(50);
        list.printList();
//        System.out.println("Total nodes "+list.countNode());
//        list.addAtPos(8,10);
//        list.addAtPos(18,0);
//        list.addAtPos(15,5);
//        list.printList();
//        System.out.println("Total nodes "+list.countNode());
//        System.out.println("Searched ele "+list.searchNode(40));
        System.out.println("Searched ele "+list.searchNodeBySir(40));
    }
}
