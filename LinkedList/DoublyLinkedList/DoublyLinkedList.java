package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    Node headNode = null;
    
    public int sizeOf()
    {
        if(checkFirsNode())
        {
            return 0;
        }
        else
        {
            Node temp =headNode;
            int sayac = 0;
            while(temp.next != null)
            {
                temp = temp.next;
                sayac++;
            }
            return sayac;

        }
    }
    public boolean checkFirsNode(){
        if(headNode == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void headAdd(int data)
    {
        Node newNode = new Node(data);
        if(checkFirsNode())
        {
            headNode=newNode;
            return;
        }
        newNode.next=headNode;
        headNode.prev = newNode;
        headNode=newNode;
    }
    public void endAdd(int data)
    {
        Node newNode = new Node(data);
        
        if(checkFirsNode())
        {
            headAdd(data);
            return;
        }
        else
        {
            Node temp = headNode;

            while(temp.next != null)
            {
                temp= temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
            
        }
    }
    public void intercaliation(int data, int index)
    {
        int sayac  = 1 ;
        if(index == 0 || checkFirsNode())
        {
            headAdd(data);
        }
        else if(sizeOf()==index)
        {
            endAdd(data);
            return;
        }
        else if(sizeOf()<index)
        {
            System.out.println("The index information you provided was not found.");
        }
        else
        {
            Node newNode = new Node(data);
            
            Node temp  = headNode;
            
            while(temp.next != null)
            {
                if(sayac == index)
                { 
                    break;
                }
                
                temp = temp.next;
                sayac++;
            }
           

            newNode.next=temp.next; 
            newNode.prev = temp;
            temp.next = newNode; 
            newNode.next.prev = newNode;
        }
        
    }
    public void nextDisplay() {
        Node temp = headNode;
        if(checkFirsNode())
        {
            System.out.println("List Empty");
        }
        else
        {
            int sayac = 0;
            while(temp != null)
            {
                System.out.println(sayac + " ) " + temp.data);
                temp = temp.next;
                sayac++;
            }
        }
        
    }
    public void prevDisplay()
    {
        Node temp = headNode;
        if(checkFirsNode())
        {
            System.out.println("List Empty");
        }
        else
        {
            int sayac = 0;
            while(temp.next != null)
            {
                temp = temp.next;
                sayac++;
            }
            
            while(temp != null)
            {
                System.out.println(sayac + " ) " + temp.data);
                temp = temp.prev;
                sayac--;
            }
        }
    }
    public void delete(int data)
    {
        Node temp=headNode;
        if(checkFirsNode())
        {
            System.out.println("List Empty!!!");
            return;
        }
        if(headNode.data == data)
        {
            headNode = headNode.next;
            temp.next.prev = null;
        }
        if(search(data) == sizeOf())
        {
            while(temp.next.next!=null)
            {
                temp= temp.next;
            }
            temp.next=null;
            return;
        }
        while(temp.next.data != data)
        {
            if(temp.next.next == null)
            {
                return;
            }
            temp= temp.next;
        }
        temp.next.next.prev=temp;
        temp.next = temp.next.next;
        
       
    }
    public int search(int data)
    {
        int sayac = 0;
        Node active = headNode;
        while(active!=null)
        {
            if(active.data!=data)
            {
                active=active.next;
                sayac++;
            }
            else
            {
                break;
            }
        }
        if(sayac>sizeOf())
            {
                return -1;
            }
            else
            {
                return sayac;
            }
    }
    public void sortAdd(int data)
    {
        Node temp = headNode;
        Node newNode = new Node(data);
        if(checkFirsNode())
        {
            headAdd(data);
        }
        else
        {
            if(newNode.data < temp.data)
            {
                headAdd(data);
                return;
            }
            else
            {
                while (temp.next != null) {
                    if(newNode.data>temp.next.data)
                    {
                        temp=temp.next;
                    }
                    else
                    {
                        newNode.next=temp.next;
                        newNode.prev=temp;
                        temp.next=newNode;
                        newNode.next.prev=newNode;
                        return;
                    }
                    
                }
                if(temp.next == null)
                {
                    endAdd(data);
                    return;
                }
            }
        }
    }
}
