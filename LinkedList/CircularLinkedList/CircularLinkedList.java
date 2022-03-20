package LinkedList.CircularLinkedList;



public class CircularLinkedList {
        Node headNode = null;
        Node tailNode = null;
        public boolean checkFirsNode(){
            if(headNode==null)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public int sizeOf()
        {
            if(checkFirsNode())
            {
                return 0;
            }
            else
            {
                Node temp = headNode;
                int sayac = 0;
                while(temp.next!=headNode)
                {
                    temp=temp.next;
                    sayac++;
                }
                return sayac;
            }
        }
        public int Search(int data)
        {
            int sayac=0;
            Node active = headNode;
            while (active.next != headNode) 
            {
                if(active.data != data)
                {
                    active = active.next;
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
        public void Display()
        {
            Node temp = headNode;
            if(checkFirsNode())
            {
                System.out.println("List Empty");
            }
            else
            {
                int sayac = 0;
                while(temp.next != headNode)
                {
                    System.out.println(sayac + " ) " + temp.data);
                    temp = temp.next;
                    sayac++;
                }
                System.err.println(sayac + " ) " + temp.data);
            }
        }
        public void headAdd(int data)
        {
            Node newNode = new Node(data);
            if(checkFirsNode())
            {
                headNode=newNode;
                tailNode=newNode;
                tailNode.next=headNode;
                
            }
            else
            {
                newNode.next=headNode;
                headNode=newNode;
                tailNode.next=headNode;
            }
        }
        public void endAdd(int data)
        {
            Node newNode = new Node(data);
            if(checkFirsNode())
            {
                headAdd(data);
            }
            else
            {
                tailNode.next = newNode;
                tailNode = newNode; 
                newNode.next = headNode;
            }
        }
        public void intercaliation(int data ,int index)
        {
            int sayac=1;
            if(index == 0 || checkFirsNode())
            {
                headAdd(data);
            }
            else if(sizeOf()==index)
            {
                endAdd(data);
            }
            else if(sizeOf()<index)
            {
            System.out.println("The index information you provided was not found.");
            }
            else
            {
                Node newNode = new Node(data);
                Node temp = headNode;

                while (temp.next != null) {
                    if(sayac==index)
                    {
                        break;
                    }
                    temp = temp.next;
                    sayac++;
                }
                newNode.next=temp.next;
                temp.next=newNode;
            }
        }
        public void Delete(int data) {
            Node temp = headNode;
            if(checkFirsNode())
            {
                System.out.println("List empty");
            }
            else if(headNode.data ==data){
                headNode=headNode.next;
                tailNode.next=headNode;
               
            }
            else if(tailNode.data==data)
            {
                while(temp.next !=tailNode)
                {
                    temp=temp.next;
                }
                temp.next=headNode;
                tailNode=temp;
            }
            else
            {
                while(temp.next.data !=data){
                    if(temp.next.next == null)
                    {
                        System.out.println("The element to be deleted was not found.");
                        return;
                    }
                    temp = temp.next;
                }
                temp.next =temp.next.next;
            }
        }
        public void sortAdd(int data){
            Node temp = headNode;
            Node newNode = new Node(data);
            if(checkFirsNode() || newNode.data<=temp.data){
                headAdd(data);
            }
            else
            {
                while (temp.next != headNode) {
                    if(newNode.data>temp.next.data)
                    {
                        temp=temp.next;
                    }
                    else{
                        newNode.next=temp.next;
                        temp.next=newNode;
                        return;
                     }
                }
                if(temp.next==headNode)
                {
                    endAdd(data);
                }
            }
        }
        public CircularLinkedList Reverse(CircularLinkedList cList)
        {
            CircularLinkedList cList2 = new CircularLinkedList();
            do {
                cList2.headAdd(cList.tailNode.data);
                Delete(tailNode.data);
            } while (cList.tailNode != headNode);
            return cList2;
        }
        public void Reversee(Node current){
            if(current.next == headNode)
            {
                System.out.println(current.data);
                return;
            }
            Reversee(current.next);
            System.out.println(current.data);
        }
    }
