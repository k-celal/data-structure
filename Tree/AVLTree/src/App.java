import java.util.Scanner;

public class App {
  public static void seeList(AVLTree avt, Scanner sc) {
    System.out.print(
        "Please choose how you want to view the list.\n1-)preOrder\n2-)inOrder\n3-)postorder\nSelection : ");
    String select = sc.nextLine();

    if (select.equals("1")) {
      avt.preOrder(avt.rootNode);
    } else if (select.equals("2")) {
      avt.inOrder(avt.rootNode);
    } else if (select.equals("3")) {
      avt.postOrder(avt.rootNode);
    } else {
      System.out.println("Mistake wrong choice");
    }
  }

  public static void main(String[] args) {
    AVLTree avt = new AVLTree();
    Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(
                    "Please select your process\n1-)Add\n2-)Delete\n3-)seeList\n4-)Height\nq-)Exit\nSelection : ");
            String select = sc.nextLine();
            if (select.equals("q")) {
                break;
            } else if (select.equals("1")) {
                System.out.print("Please add elements data : ");
                int data = sc.nextInt();
                sc.nextLine();
                avt.insert(data);
            } else if (select.equals("2")) {
                System.out.print("Please enter the data of the element you want to delete : ");
                int data = sc.nextInt();
                sc.nextLine();
                avt.delete(data);
            } else if (select.equals("3")) {
                seeList(avt, sc);
            } else if (select.equals("4")) {
                System.out.println("Tree height is : " + avt.height());
            } else if (select.equals("q")) {
                break;
            } else {
                System.out.println("Mistake wrong choice");
            }
        }
  }
}