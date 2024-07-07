package dsa.dynstack;

public class UseStack {
    public static void main(String[] args) {
        Stack s=new Stack();
        System.out.println("Is stack empty ?"+s.isEmpty());
        System.out.println("Total ele:"+s.size());
        s.push(10);
        s.push(20);
        System.out.println("Total ele:"+s.size());
        System.out.println("Is stack empty ?"+s.isEmpty());
        System.out.println("Top ele:"+s.peek());
        System.out.println("Popping top ele:"+s.pop());
        System.out.println("Total ele:"+s.size());
        System.out.println("Is stack empty ? "+s.isEmpty());
        System.out.println("Top ele:"+s.peek());
    }
}
