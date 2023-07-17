public class Node {
    public int data;
    public int height;
    public Node leftNode;
    public Node rightNode;

    public Node(int data) {
        this.data = data;
        height=1;
        leftNode=null;
        rightNode=null;
    }

    
}