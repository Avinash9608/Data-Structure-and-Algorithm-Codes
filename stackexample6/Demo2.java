package dsa.stackexample6;

public class Demo2 {
    public static void m1()
    {
        System.out.println("Inside m1");
        m1();
    }

    public static void main(String[] args) {
        m1();
    }
}
