public class QueueAndLS {
    public Node frontNode;
    public Node rearNode;
    public int counter;
    public int counter2;
    public int size;    
    
    public QueueAndLS(int size) {
        this.size = size;
        counter = 0;
        frontNode = null;
        rearNode = null;
    }

    public boolean Full(){
        return (counter == size);

    }

    public boolean Empty() {
        return (counter==0);
    }
    public void enQueue(int data){
        if(Full())
        {
            System.out.println("Queue is Full!!!");
        }
        else
        {
            Node newNode = new Node(data);
            if(frontNode==null)
            {
                frontNode=newNode;
                rearNode=newNode;
                counter++;
            }
            else
            {
                rearNode.next=newNode;
                rearNode=newNode;
                counter++;
            }
        }

    }
    public void deQueue(){
        if(Empty())
        {
            System.out.println("Queue is Empty!!!");
        }
        else
        {
            System.out.println(frontNode.data);
            frontNode = frontNode.next;
            counter--;
        }
    }
    public void Peek(){
        if(Empty())
        {
            System.out.println("Queue is Empty!!!");
        }
        else
        {
            System.out.println("Peek : " + frontNode.data);
        }

    }
    public int Size(){
        return counter;
    }
}
