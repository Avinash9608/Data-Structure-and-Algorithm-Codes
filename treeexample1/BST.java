package dsa.treeexample1;


import java.util.NoSuchElementException;
import java.util.Stack;

public class BST {
    private Node root;
    public void append(int x)
    {
        Node p=new Node(x);
        if(root==null)
        {
            root=p;
            return;
        }
        Node temp=root, prev=null;
        while (temp!=null)
        {
            prev=temp;
            if(temp.getData()>x)
            {
                temp=temp.getLeft();
            }else {
                temp=temp.getRight();
            }
        }
        if(prev.getData()>x)
        {
            prev.setLeft(p);
        }else
        {
            prev.setRight(p);
        }
    }

    public void preorder()
    {
        if(root==null)
        {
            System.out.println("Empty tree");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        st.push(temp);
        while (!st.empty())
        {
            temp=st.pop();
            while (temp!=null)
            {
                System.out.println(temp.getData());
                if(temp.getRight()!=null)
                {
                    st.push(temp.getRight());
                }
                temp=temp.getLeft();
            }
        }
    }

    public void preorder2()
    {
        if(root==null)
        {
            System.out.println("Empty tree");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while (true)
        {
            System.out.println(temp.getData());
            if(temp.getRight()!=null)
            {
                st.push(temp.getRight());
            }
            temp=temp.getLeft();
            if(temp==null)
            {
                if(st.empty())
                {
                    break;
                }
                temp=st.pop();
            }
        }
    }

    public void inorder()
    {
        if(root==null)
        {
            System.out.println("Empty tree");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while (temp!=null || st.empty()==false)
        {
            while (temp!=null)
            {
                st.push(temp);
                temp=temp.getLeft();
            }
            temp=st.pop();
            System.out.println(temp.getData());
            temp=temp.getRight();
        }
    }

    public boolean checkBST()
    {
        if(root==null)
        {
            System.out.println("Empty tree");
            return false;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        Integer prev=null;
        while (temp!=null || st.empty()==false) {
            while (temp != null) {
                st.push(temp);
                temp = temp.getLeft();
            }
            temp = st.pop();
            System.out.println(temp.getData());
            if(prev!=null && temp.getData()<=prev)
                return false;
            prev=temp.getData();
            temp = temp.getRight();
        }
        return true;
    }

    public void postorder()
    {
        if(root==null)
        {
            System.out.println("Empty Tree");
            return;
        }
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while(temp!=null || st.empty()==false)
        {
            while (temp!=null)
            {
                st.push(temp);
                if(temp.getRight()!=null)
                {
                    temp.getRight().setFlag(-1);
                    st.push(temp.getRight());
                }
                temp=temp.getLeft();
            }
            temp=st.pop();
            if(temp.getFlag()==0)
            {
                System.out.println(temp.getData());
                temp=null;
            }else {
                temp.setFlag(0);
            }
        }
    }

    public Node[] search(int x)
    {
        Node[] arr=new Node[2];
        Node par=null, child=root;
        while (child!=null)
        {
            if(child.getData()==x)
            {
                arr[0]=par;
                arr[1]=child;
                return arr;
            }
            par=child;
            if(child.getData()>x)
                child=child.getLeft();
            else
                child=child.getRight();
        }
        return null;
    }

    public boolean deleteNode(int x)
    {
        if(root==null)
        {
            throw new NoSuchElementException("Tree is Empty ");
        }
        Node[] arr=search(x);
        if(arr==null)
        {
            return false;
        }
        Node par=arr[0];
        Node child=arr[1];
        Node succ;
        if(child.getLeft()!=null && child.getRight()!=null)
        {
            succ=child.getRight();
            par=child;
            while (succ.getLeft()!=null)
            {
                par=succ;
                succ=succ.getLeft();
            }
            child.setData(succ.getData());
            child=succ;
        }if(child.getLeft()==null && child.getRight()==null){
            if(par==null)
            {
                root=null;
            } else if (child==par.getLeft()) {
                par.setLeft(null);
            }else
            {
                par.setRight(null);
            }
    }
        else if(child.getLeft()!=null && child.getRight()==null)
    {
        if(par==null)
        {
            root=child.getLeft();
        }
        else if(child==par.getRight()){
            par.setLeft(child.getLeft());
        }else {
            par.setRight(child.getLeft());
        }
    }
        else if(child.getLeft()==null && child.getRight()!=null)
    {
        if(par==null)
        {
            root=child.getRight();
        }else if(child==par.getLeft())
        {
            par.setLeft(child.getRight());
        }else {
            par.setRight(child.getRight());
        }
    }
        return true;
    }
}
