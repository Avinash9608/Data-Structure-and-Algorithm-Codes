package dsa.queueex4;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class UseQueue {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int choice;
        int n;
        Queue<Integer> q=new LinkedBlockingDeque<>(3);
        do{
            System.out.println("Select an operation ");
            System.out.println("1.enqueue\n2.dequeue\n3.peek\n4.quit");
            System.out.println("Enter your choice ");
            choice=kb.nextInt();
            switch (choice)
            {
                case 1:
                    try {
                        System.out.println("Enter value: ");
                        n = kb.nextInt();
                        q.add(n);
                        System.out.println("Inserted:" + n);
                    }catch (IllegalStateException ex)
                    {
                        System.out.println("Exception while adding data "+ex.getMessage());
                    }
                    break;

                case 2:
                    try{
                        n=q.remove();
                        System.out.println("deleted ele:"+n);
                    }catch (NoSuchElementException ex)
                    {
                        System.out.println("Exception in deleting "+ex.getMessage());
                    }
                    break;
                case 3:
                    try{
                        n=q.element();
                        System.out.println("head ele: "+n);
                    }catch (NoSuchElementException ex)
                    {
                        System.out.println("Exception in deleting "+ex.getMessage());
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choice. Try again");
            }
        }while (choice!=4);
    }
}
