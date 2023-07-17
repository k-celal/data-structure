import java.util.Scanner;

public class App {
    static Scanner sc = new Scanner(System.in);
    static linkedList lst = new linkedList();



    public static void Add()
    {
        System.out.print("Please add elements data : ");
        int data = sc.nextInt();
        sc.nextLine();
        lst.sorttadd(data);

    }
    public static void Delete()
    {
        System.out.print("Please enter the data of the element you want to delete : ");
        int data = sc.nextInt();
        sc.nextLine();
        lst.delete(data);
    }
    public static void seeList()
    {
        lst.display();
    }
    public static void Search() {
        System.out.print("please enter the data of the element you want to search : ");
        int data = sc.nextInt();
        sc.nextLine();
        if(lst.search(data)==-1)
        {
            System.out.println("The item you searched for was not found");
        }else{
            System.out.println("the data you are looking for is in this order : " + (lst.search(data)-1));
        }
    }
   
        public static void main(String[] args) {
        
        while(true)
        {
            System.out.print("Please select your process\n1-)Add\n2-)Delete\n3-)seeList\n4-)Search\nq-)Exit\nSelection : ");
            String select = sc.nextLine();
            if(select.equals("q"))
            {
                break;
            }
            else if(select.equals("1"))
            {
                Add();
            }
            else if(select.equals("2"))
            {
                Delete();
            }
            else if(select.equals("3"))
            {
                seeList();
            }
            else if(select.equals("4"))
            {
                Search();
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
