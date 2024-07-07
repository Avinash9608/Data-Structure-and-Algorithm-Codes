package dsa.problemsolving;

import dsa.queueex1.QueueException;

import java.util.Stack;

public class QueueUsngStackModifiedVersion {
    private Stack<Integer> s1;
    private Stack<Integer> s2;
    public QueueUsngStackModifiedVersion()
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
        transfer(s1,s2);
        int x=s2.pop();
        transfer(s2,s1);
        return x;
    }
    public int peek()
    {
        if(s1.empty())
        {
            throw new QueueException("Queue underflow");
        }
        transfer(s1,s2);
        int x=s2.peek();
        transfer(s2,s1);
        return x;
    }

    public void transfer(Stack<Integer>source, Stack<Integer>dest)
    {
        while (!source.empty())
        {
            dest.push(source.pop());
        }
    }

}
class UseQueueUsingStackModifiedVersion
{
    public static void main(String[] args) {
        QueueUsngStackModifiedVersion queue=new QueueUsngStackModifiedVersion();
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
