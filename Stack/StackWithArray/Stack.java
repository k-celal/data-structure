package Stack.StackWithArray;


public class Stack {
    public int array[];
    public int size;
    public int index;

    public Stack(int size) {
        this.size = size;
        array = new int[size];
        index = -1;
    }

    public void Push(int data) {
        if(Full())
        {
            System.out.println("Array Full!!!");
        }
        else 
        {   
            array[++index] = data;
        }
    }

    public int Pop(){
        if(Empty())
        {
            System.out.println("Array Empty!!!");
            return -1;
        }
        else
        {
            return array[index--];
        }
    }
    public boolean Empty(){
        return (index == -1);
    }
    public boolean Full(){
        return(index == size-1);
    }
    
    public int Search(int data){
        int count=0;
        while(array[count] != data){
            if(++count == size)
            {
                return -1;
            }
            count++;
        }
        return count;
    }
    public void Peek(){
        System.out.println("Peek : " + array[index]);
    }

    
    
}
 