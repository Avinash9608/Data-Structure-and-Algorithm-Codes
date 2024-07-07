package dsa.queueex1;

public class Queue {
    private int []arr;
    private int front, rear, size;
    public Queue(int size)
    {
        arr=new int[size];
        this.size=size;
        front=0;
        rear=-1;
    }

    public void enqueue(int x)
    {
        if(rear==size-1)
        {
            throw new QueueException("Queue Overflow ");
        }
        rear++;
        arr[rear]=x;
    }

    public int dequeue()
    {
        if(front>rear)
        {
            throw new QueueException("Queue Underflow ");
        }
        int x=arr[front];
        front++;
        return x;
    }

    public int peek()
    {
        if(front>rear)
        {
            throw new QueueException("Queue Underflow ");
        }
        int x=arr[front];
        return x;
    }
}
