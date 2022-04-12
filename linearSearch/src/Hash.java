public class Hash {
    int key;
    int counter;
    int[] hasMap= new int[100];
    
    public void hashAdd(int value) {
        key=value%100;
        if(hasMap[key]!=0){
            counter++;
            if(linearProbing(value)==-1){
                System.out.println("List is full");
            }
            hasMap[linearProbing(value)]=value;
        }
        else{
            hasMap[key]=value;
        }
    }
    public int linearProbing(int value){
        for (int i = 0; i < hasMap.length; i++) {
            key=(value+i)%100;
            if(hasMap[key]!=0){
                counter++;
                continue;
            }
            else{
                return key;
            }
        }
        return -1;
    }
    public int linearSearch(int value){
        key=value%100;
        if(hasMap[key]==value){
            return key;
        }
        else{
            for (int i = 0; i < hasMap.length; i++) {
                key=(value+i)%100;
                if(hasMap[key]==value){
                    return key;
                }else{
                    counter++;
                    continue;
                }              
            }
        }
        return -1;
    }
    public void linearDelete(int value){
        if(linearSearch(value)!=-1){
            hasMap[linearSearch(value)]=0;
        }
        else{
            System.out.println("The item you requested is not in the list");
        }
    }
}
