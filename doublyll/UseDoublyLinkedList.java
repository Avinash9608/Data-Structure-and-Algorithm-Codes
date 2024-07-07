package dsa.doublyll;

public class UseDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList dlist=new DoublyLinkedList();
//        dlist.addAtLast(10);
//        dlist.addAtLast(20);
//        dlist.addAtLast(30);
//        dlist.addAtLast(40);

        dlist.prepand(10);
        dlist.prepand(20);
        dlist.prepand(30);
        dlist.printList();
//        System.out.println("Remove "+ dlist.removeLast());
        System.out.println(dlist.removeData(20));
        dlist.printList();
    }
}
