public class linkedList {
    Node headNode;

    public linkedList() {
        headNode = null;
    }

    public void headAdd(int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = headNode;
        headNode = newNode;

    }
    public int sizeOf(){
        Node tempNode = new Node();
        tempNode=headNode;
        int sayac = 0;
        while(tempNode != null)
        {
            tempNode = tempNode.next;
            sayac++;
        }
        return sayac;
    }
    public void endAdd(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;
        if (headNode == null) 
        {
            headNode = newNode;
            return;
        }
        Node temp = headNode;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }

    public void intercaliation(int data, int index) {
        int sayac = 1;
        if (index == 1 || this.headNode == null) {
            this.headAdd(data);
        } else {
            Node newNode = new Node();
            newNode.data = data;
            Node temp = headNode;
            while (temp.next != null) {
                if (sayac + 1 == index) {
                    break;
                }
                temp = temp.next;
                sayac++;
            }
            Node temp2 = temp.next;
            temp.next = newNode;
            newNode.next = temp2;
        }
    }

    public int delete(int data) {
        if (headNode == null) {
            return -1;
        }
        if (headNode.data == data) {
            headNode = headNode.next;
            return 0;
        }
        Node temp = headNode;
        while (temp.next.data != data) {
            if (temp.next.next == null) {
                return -2;
            }
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return 0;
    }

    public void display() {
        Node temp = headNode;
        if (temp == null) {
            System.out.println("List empty");
            return;
        }
        int sayac = 1;
        while (temp != null) {

            System.out.println(sayac + " ) " + temp.data);
            temp = temp.next;
            sayac++;
        }
    }
    
    public int search(int data) {
        int sayac=1;
        Node active = headNode;
        while (active != null) {
            if (active.data != data) {
                active = active.next;
            } else {
                sayac++;
                break;
            }
            sayac++;
        }
        if(sizeOf()<sayac){
            return -1;
        }else{
            return sayac;
        }
        
    }
    public void sorttadd(int data){//me
        Node tempNode = headNode;
        Node newNode = new Node(data);
        if(headNode==null){
            headNode=newNode;
        }
        else{
                if(newNode.data<= headNode.data){
                    newNode.next=headNode;
                    headNode=newNode;
                }
                else{
                    while(tempNode.next!=null){
                        if(tempNode.data<data && tempNode.next.data>data){
                            newNode.next=tempNode.next;
                            tempNode.next=newNode;
                            return;
                        }
                        else{
                            tempNode=tempNode.next;
                        }
                    }
                    tempNode.next=newNode;
                }

        }
    }
    public void sortAdd(int data)
    {
        Node temp = headNode;
        Node newNode = new Node(data);
        if(headNode == null)
        {
            headNode=newNode;
        }
        else
        {
            if(newNode.data<=temp.data)
            {
                newNode.next =headNode;
                headNode=newNode;
                return;
            }
            else
            {
                while (temp.next != null) 
                {
                    if(newNode.data>temp.next.data)
                    {
                        temp=temp.next;
                    }
                    else
                    {
                        newNode.next=temp.next;
                        temp.next=newNode;
                        return;
                    }    
                }
                if(temp.next==null)
                {
                    newNode.next = temp.next;
                    temp.next=newNode;
                }
            }
        }
    }
}
