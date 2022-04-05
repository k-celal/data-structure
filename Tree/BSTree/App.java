package Tree.BSTree;

import java.util.Scanner;

public class App {
    public static void seeList(BSTree bt ,Scanner sc){
        System.out.print("Please choose how you want to view the list.\n1-)preOrder\n2-)inOrder\n3-)postorder\nSelection : ");
        String select = sc.nextLine();
        
        if(select.equals("1"))
        {
            bt.preOrder(bt.rootNode);
        }
        else if(select.equals("2"))
        {
            bt.inOrder(bt.rootNode);
        }
        else if(select.equals("3"))
        {
            bt.postOrder(bt.rootNode);
        }
        else
        {
            System.out.println("Mistake wrong choice");
        }
    }
    public static void main(String[] args) {
        BSTree bt = new BSTree();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Please select your process\n1-)Add\n2-)Delete\n3-)seeList\n4-)Height\n5-)Size\nq-)Exit\nSelection : ");
            String select = sc.nextLine();
            if(select.equals("q"))
            {
                break;
            }
            else if(select.equals("1"))
            {
                System.out.print("Please add elements data : ");
                int data = sc.nextInt();
                sc.nextLine();
                bt.Add(data);
            }
            else if(select.equals("2"))
            {
                System.out.print("Please enter the data of the element you want to delete : ");
                int data = sc.nextInt();
                sc.nextLine();
                bt.Delete(bt.rootNode,data);
            }
            else if(select.equals("3"))
            {
                seeList(bt,sc);
            }
            else if(select.equals("4"))
            {
                System.out.println("Tree height is : " + bt.height);
            }
            else if(select.equals("5"))
            {
                System.out.println("Tree size is : " + bt.nodeCounter);

            }
            else if(select.equals("q"))
            {
                break;
            }
            else
            {
                System.out.println("Mistake wrong choice");
            }
        }

    }   

    
 
    
    
}
