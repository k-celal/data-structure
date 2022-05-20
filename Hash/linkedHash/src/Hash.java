
public class Hash {
    int key;
    Node[] nd = new Node[100];
    public void Add(int value) {
        key=value%100;
        Node newNode = new Node(value);
        if(nd[key]!=null){
            newNode.next=nd[key];
            nd[key]=newNode;
        }else{
            nd[key]=newNode;
        }
    }
    public void Search(int value) {
        int counter=0;
        key=value%100;
        Node tempNode = nd[key];
        while(tempNode!=null){
            if(tempNode.data==value){
                System.out.println("Data " + key + " in " + counter);
                return;
            }else{
                tempNode=tempNode.next;
                counter++;
                
            }
        }
    }
    public void Delete(int value){
        key=value%100;
        Node tempNode=nd[key];
        while (tempNode!=null) {
            if(tempNode.next.data==value){
                tempNode.next=null;
                return;
            }
            else{
                tempNode=tempNode.next;
            }
        }
        
    }
    public void Display() {
        Node tempNode = new Node();
        for (int i = 0; i < nd.length; i++) {
            if(nd[i]==null){
                continue;
            }else{
                System.out.print(i + "-)" + nd[i].data);
                if(nd[i].next!=null){
                    tempNode=nd[i];
                    while(tempNode.next != null){
                    System.out.print(" -> "+tempNode.next.data);
                    tempNode=tempNode.next;
                    }
                }
            }
            System.out.println();   
        }
    }

}
