package dsa.problemsolving;

import dsa.queueex1.QueueException;

import java.util.Stack;

public class QueueUsingStack {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public QueueUsingStack()
    {
        s1=new Stack<>();
        s2=new Stack<>();
    }

    public void enqueue(int x)
    {
        s1.push(x);
    }
    public int dequeue()
    {
        if(s1.empty())
        {
            throw new QueueException("Queue underflow");
        }
        while (!s1.empty())
        {
            s2.push(s1.pop());
        }
        int x=s2.pop();
        while (!s2.empty())
        {
            s1.push(s2.pop());
        }
        return x;
    }
    public int peek()
    {
        if(s1.empty())
        {
            throw new QueueException("Queue underflow");
        }
        while (!s1.empty())
        {
            s2.push(s1.pop());
        }
        int x=s2.peek();
        while (!s2.empty())
        {
            s1.push(s2.pop());
        }
        return x;
    }

}
class UseQueueUsingStack
{
    public static void main(String[] args) {
        QueueUsingStack queue=new QueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println("Top ele: "+queue.peek());
        System.out.println("Dequeue: "+queue.dequeue());
        System.out.println("Now top ele: "+queue.peek());
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Top ele: "+queue.peek());
        System.out.println("Dequeue: "+queue.dequeue());
        System.out.println("Now top ele: "+queue.peek());
    }
}
