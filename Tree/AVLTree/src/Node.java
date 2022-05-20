public class Node {
    public int data;
    public int height;
    public Node rightNode;
    public Node leftNode;

    public Node(int data) {
        this.data = data;
        this.height=1;
        this.leftNode=null;
        this.rightNode=null;
    }
}
