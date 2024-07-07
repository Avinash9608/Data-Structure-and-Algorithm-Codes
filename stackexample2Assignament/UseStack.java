package dsa.stackexample2Assignament;


import java.util.Scanner;

public class UseStack {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Stack s = new Stack(5);
        int x;
        do {
            System.out.println("Select an option :");
            System.out.println("1.Push \n2.Pop \n3.Peek \n4.Quit");
            System.out.println("Enter your choice ");
            x = kb.nextInt();
            switch (x) {
                case 1: {
                    try {
                        System.out.println("Enter element to push");
                        int element = kb.nextInt();
                        s.push(element);
                        System.out.println("Pushed: " + element);
                    } catch (StackException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                break;

                case 2: {
                    try {
                        System.out.println("Pushed: " + s.pop());
                    } catch (StackException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                break;
                case 3: {
                    try {
                        System.out.println("Top Element is : " + s.peek());
                    } catch (StackException ex) {
                        System.out.println(ex.getMessage());
                    }
                }
                break;
                case 4: {
                    System.exit(0);
                }
                break;
                default:
                    System.out.println("Wrong Choice: \n TryAgain");
            }
        } while (x != 4);

    }
}