package dsa.expression2;

import java.util.Scanner;

public class UsePrefix {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid prefix expression ");
        String prefix=kb.next();
        Prefix obj=new Prefix(prefix);
        System.out.println("Result "+obj.evaluate());
    }
}
