package dsa.stackexample4;

import java.util.ArrayList;
import java.util.List;

public class Stack {
    private List<Integer> myList;
    private  int tos;

    public Stack()
    {
        myList=new ArrayList<>();
        tos=-1;
    }

    public void push(int x)
    {
        tos++;
        myList.add(tos,x);
    }

    public int pop()
    {
        if(tos==-1)
        {
            StackException obj=new StackException("Stack underflow");
            throw obj;
        }
        int x;
        x=myList.remove(tos);
        tos--;
        return x;
    }

    public int peek()
    {
        if(tos==-1)
        {
            StackException obj=new StackException("Stack underflow");
            throw obj;
        }
        int x;
        x=myList.get(tos);
        return x;
    }
}
