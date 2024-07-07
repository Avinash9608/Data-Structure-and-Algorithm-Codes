package dsa.problemsolving.linkedListproblem;

public class UseLinkedList {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        System.out.println("Total node "+list.countNode());
//        list.addAtLast(10);
//        list.addAtLast(20);
//        list.addAtLast(30);
//        list.addAtLast(40);
//        list.addAtLast(50);
//        list.addAtPos(10,0);
//        list.addAtPos(20,0);
//        list.addAtPos(30,2);
//        list.addAtPos(40,1);
        list.insert(10);
        list.insert(5);
        list.insert(25);
        list.insert(7);
        list.insert(9);
        list.printList();
        System.out.println("Total nodes "+list.countNode());
//        System.out.println("Printing reverse list ");
//        list.reverseList();
    }
}
