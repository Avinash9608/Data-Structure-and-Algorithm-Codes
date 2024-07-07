package dsa.stackexample1;

public class Stack {
    private int[] arr;
    private  int tos;
    private int size;
    public Stack(int size)
    {
        arr=new int[size];
        this.size=size;
        tos=-1;
    }

    public void push(int x)
    {
        if(tos==size-1)
        {
            System.out.println("Stack Overflow ");
            return;
        }
        tos++;
        arr[tos]=x;
    }

    public int pop()
    {
        if(tos==-1)
        {
            System.out.println("Stack Underflow ");
            return 0;
        }
        int x;
        x=arr[tos];
        tos--;
        return x;
//        return arr[tos--];
    }

    public int peek()
    {
        if(tos==-1)
        {
            System.out.println("Stack Underflow ");
            return 0;
        }
        int x;
        x=arr[tos];
        return x;
//        return arr[tos];
    }
}
