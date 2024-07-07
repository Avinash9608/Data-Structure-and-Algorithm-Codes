package dsa.heapdemo;

import java.util.Scanner;

public class Heap {
    public static void insHeap(int arr[], int x, int i)
    {
        int parIndex, childIndex=i;
        while (childIndex>1)
        {
            parIndex=childIndex/2;
            if(arr[parIndex]>x)
            {
                arr[childIndex]=x;
                return;
            }
            arr[childIndex]=arr[parIndex];
            childIndex=parIndex;
        }
        arr[i]=x;
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int arr[]=new int[10];
        for(int i=1;i<=9;i++)
        {
            System.out.println("Enter value to be added in heap");
            int x=kb.nextInt();
            insHeap(arr,x,i);
        }
        System.out.println("Heap is ");
        for(int x:arr)
        {
            System.out.println(x);
        }
    }
}
