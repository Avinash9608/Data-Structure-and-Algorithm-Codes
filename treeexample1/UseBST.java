package dsa.treeexample1;

public class UseBST {
    public static void main(String[] args) {
        BST bst=new BST();
        bst.append(10);
        bst.append(15);
        bst.append(12);
        bst.append(8);
        bst.append(5);


//        bst.preorder2();
//        bst.inorder();
//        System.out.println(bst.checkBST());
//        bst.postorder();
        bst.deleteNode(12);
        bst.postorder();
    }
}
