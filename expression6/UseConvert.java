package dsa.expression6;

import java.util.Scanner;

public class UseConvert {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter a valid infix expression ");
        String infix=kb.next();
        Convert conv=new Convert(infix);
        conv.toPostFix();
        System.out.println(conv);
}
}