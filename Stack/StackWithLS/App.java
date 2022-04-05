package Stack.StackWithLS;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the size of the stack you want to create : ");
        int size = sc.nextInt();
        sc.nextLine();
        LSAndStack lStack = new LSAndStack(size);

        while(true){
            System.out.print("Please select your process\n1-)Push\n2-)Pop\n3-)Empty\n4-)Full\n5-)Peek6-)SizeOf\n\nSelect : ");
            String select = sc.next();
            if(select.equals("q"))
            {
                break;
            }
            else if(select.equals("1"))
            {
                System.out.print("Please Push elements data : ");
                int data = sc.nextInt();
                sc.nextLine();
                lStack.Push(data);
            }
            else if(select.equals("2"))
            {
                lStack.Pop();
            }
            else if(select.equals("3")){
                if(lStack.Empty())
                {
                    System.out.println("Queue is empty");
                }
                else{
                    System.out.println("Queue is not empty");
                }
            }
            else if(select.equals("4")){
                if(lStack.Full())
                {
                    System.err.println("Queue is Full");
                }
                else{
                    System.out.println("Queue is not Full");
                }
            }
            else if(select.equals("5")){
                lStack.Peek();
            }
            else if(select.equals("6")){
                lStack.sizeOf();
            }
            else{
                System.out.println("Mistake wrong choice");
            }
        }
        sc.close(); 
        

    }
    
}
