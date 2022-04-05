package Tree.BSTree;



public class App {
    public static void main(String[] args) {
        BSTree bt = new BSTree();

        

        bt.Add(10);
        bt.Add(8);
        bt.Add(15);
        bt.Add(5);
        bt.Add(12);
        bt.Add(20);
        bt.Add(9);
        bt.Add(25);
        bt.Add(30);
        bt.inOrder(bt.rootNode);
        bt.Delete(bt.rootNode, 10);
        System.out.println("--------------");
        bt.inOrder(bt.rootNode);


    }   

    
 
    
    
}
