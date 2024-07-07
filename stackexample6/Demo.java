package dsa.stackexample6;

public class Demo {
    public static void m3()
    {
        System.out.println("inside m3");
    }
    public static void m2()
    {
        System.out.println("Inside m2");
        m3();
        System.out.println("Resuming m2");
    }
    public static void m1()
    {
        System.out.println("inside m1");
        m2();
        System.out.println("Resuming m1");
    }

    public static void main(String[] args) {
        System.out.println("Inside main");
        m1();
        System.out.println("Resuming main");
    }
}
