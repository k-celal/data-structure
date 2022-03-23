package Tree.BSTree;

public class BSTree {
    Node rootNode;

    public BSTree() {
        rootNode=null;
    }

    public Node newNode(int data){
        rootNode = new Node(data);
        System.out.println(data + " Add a tree");
        return rootNode;
    }
    public Node Insert(Node rootNode,int data){
        if(rootNode != null)
        {
            if(data<rootNode.data)
            {   
                rootNode.leftNextNode = Insert(rootNode.leftNextNode, data);
            }
            else
            {
                rootNode.rightNextNode = Insert(rootNode.rightNextNode, data);
            }
        }
        else
        {
            rootNode = newNode(data);
        }
        return rootNode;
    }

    
    
}
