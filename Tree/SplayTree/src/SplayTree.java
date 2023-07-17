    public class SplayTree {
    public Node rootNode;
    public Node newNode(int data){
        Node newNode = new Node(data);
        return newNode;
    }
    public Node rightRotate(Node root){
        Node a = root.leftNode;
        root.leftNode=a.rightNode;
        a.rightNode=root;
        return a;
    }
    public Node leftRotate(Node root){
        Node a = root.rightNode;
        root.rightNode=a.leftNode;
        a.leftNode=root;
        return a;
    }
    public Node Search(Node root,int data){
        if(root==null||data==root.data){
            return root;
        }
        if(root.data>data){
            if(root.leftNode==null){
                return root;
            }
            if(root.leftNode.data>data){
                root.leftNode.leftNode = Search(root.leftNode.leftNode, data);
                root=rightRotate(root);
            }
        }
        
    }
    

}
