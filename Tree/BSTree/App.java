package Tree.BSTree;



public class App {
    public static void main(String[] args) {
        BSTree bt = new BSTree();

        bt.rootNode =  bt.Insert(bt.rootNode, 10);
        bt.rootNode =  bt.Insert(bt.rootNode, 15);
        bt.rootNode =  bt.Insert(bt.rootNode, 8);
        bt.rootNode =  bt.Insert(bt.rootNode, 20);
        bt.rootNode =  bt.Insert(bt.rootNode, 4);
        bt.rootNode =  bt.Insert(bt.rootNode, 12);

        System.out.println("Root : " + bt.rootNode.data);
        System.out.println("Root right : " + bt.rootNode.rightNextNode.data);
        
    }
    
}
