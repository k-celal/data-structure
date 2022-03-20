package Queue.QueueWithArray;

public class Queue {
    public int array[];
    public int size;
    public int counter;
    public int front;
    public int rear;

    public Queue(int size) {
        this.size = size;
        array = new int[size];
        front=0;
        rear=-1;
    }
    public void enQueue(int data){
        if(Full())
        {
            System.out.println("Queue is Full!!!");
        }
        else 
        {
            counter++;
            array[++rear] = data;
        }
    }
    public void deQueue() {
        if(Empty())
        {
            System.out.println("Queue is Empty!!!");
        }
        else
        {   
            int data = array[front];
            for(int i=1 ; i<=rear ; i++)
            {
                array[i-1] = array[i];
            }
            rear--;
            counter--;
            System.out.println(data + " Removed the Queue");
        }
        
    }
    public boolean Full() {
        return (rear == size-1);
    }
    public boolean Empty() {
        return (rear== -1);
    }
    public void Peek() {
        if(Empty())
        {
            System.out.println("Queue is Empty!!!");
        }
        else
        {
            System.out.println("Peek = " + array[front]);
        }
    }
    public int size(){
        return counter;

    }
    
}
