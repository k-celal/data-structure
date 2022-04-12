import java.util.Scanner;

public class App {
    static CircularLinkedList cList = new CircularLinkedList();
    static Scanner sc = new Scanner(System.in);

    public static void Add() {
        System.out.print("Please add elements data : ");
        int data = sc.nextInt();
        sc.nextLine();
        cList.sortAdd(data);
    }

    public static void Delete() {
        System.out.print("Please enter the data of the element you want to delete : ");
        int data = sc.nextInt();
        sc.nextLine();
        cList.Delete(data);
    }

    public static void seeList() {
        cList.Display();
    }

    public static void Search() {
        System.out.print("Please enter the data of the element you want to search : ");
        int data = sc.nextInt();
        sc.nextLine();
        System.out.println("the data you are looking for is in this order : " + cList.Search(data));
    }

    public static void sizeOf() {
        System.out.println("SizeOf = " + cList.sizeOf());

    }

    public static void main(String[] args) {

        while (true) {
            System.out.print(
                    "Please select your process\n1-)Add\n2-)Delete\n3-)seeList\n4-)Search\n5-)sizeOf\nq-)Exit\nSelection : ");
            String select = sc.nextLine();
            if (select.equals("q")) {
                break;
            } else if (select.equals("1")) {
                Add();
            } else if (select.equals("2")) {
                Delete();
            } else if (select.equals("3")) {
                seeList();
            } else if (select.equals("4")) {
                Search();
            } else if (select.equals("5")) {
                sizeOf();
            } else if (select.equals("q")) {
                break;
            } else {
                System.out.println("Mistake wrong choice");
            }

        }

        cList.Reversee(cList.headNode);
    }
}
