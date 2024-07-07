package dsa.expression1;

import java.util.Scanner;

public class UsePostfix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid expression ");
        String postfix=kb.next();
        Postfix obj=new Postfix(postfix);
        System.out.println("Result- "+obj.evaluate());
    }
}
