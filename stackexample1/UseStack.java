package dsa.stackexample1;


import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack(5);
        //  My Implementation
//        Scanner kb=new Scanner(System.in);
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("Push the element at "+i);
//            int x=kb.nextInt();
//            s.push(x);
//        }
//        System.out.println("Your push element is ");
//        for(int i=0;i<5;i++)
//        {
//            System.out.println("Peek element is "+s.peek());
//           int x=s.pop();
//            System.out.println("Element at "+i+" is "+x);
//        }

        int x=10;
        for(int i=1;i<=5;i++)
        {
            s.push(x);
            System.out.println("Pushed: "+x);
            x=x+10;
        }

        System.out.println("Top element of the stack is: "+s.peek());
        for(int i=1;i<=5;i++)
        {
            x=s.pop();
            System.out.println("Popped: "+x);
        }
    }
}
