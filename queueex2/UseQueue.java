package dsa.queueex2;

import java.util.Scanner;

public class UseQueue {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int choice,x;
        Queue obj=new Queue(5);
        do {
            System.out.println("Enter the operation:");
            System.out.println("1.Enqueue\n2.Dequeue\n3.Peek\n4.Quit");
            choice = kb.nextInt();
            switch (choice)
            {
                case 1:
                    try
                    {
                        System.out.println("Enter element to insert");
                        x=kb.nextInt();
                        obj.enqueue(x);
                        System.out.println("Inserted:"+x);
                    }catch (QueueException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        x=obj.dequeue();
                        System.out.println("Deleted:"+x);
                    }catch (QueueException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try{
                        x=obj.peek();
                        System.out.println("Top element "+x);
                    }catch (QueueException ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Wrong choice , Try Again");
            }
        }while (choice!=4);
    }
}
