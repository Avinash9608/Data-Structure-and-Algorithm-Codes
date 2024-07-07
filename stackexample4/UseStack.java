package dsa.stackexample4;


import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        int choice;
        int x;
        Scanner kb = new Scanner(System.in);
        do {
            System.out.println("Select an option :");
            System.out.println("1.Push \n2.Pop \n3.Peek \n4.Quit");
            System.out.println("Enter your choice ");
            choice = kb.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element to push");
                    x = kb.nextInt();
                        s.push(x);
                        System.out.println("Pushed: " + x);
                break;
                case 2:
                    try {
                        x=s.pop();
                        System.out.println("Pushed: " + x);
                    } catch (StackException ex) {
                        System.out.println(ex.getMessage());
                    }
                break;
                case 3:
                    try {
                        x=s.peek();
                        System.out.println("Top Element is : " + x);
                    } catch (StackException ex) {
                        System.out.println(ex.getMessage());
                    }
                break;
                case 4:
                    System.out.println("Thank you");
                break;
                default:
                    System.out.println("Wrong Choice: \n TryAgain");
            }
        } while (choice != 4);

    }
}