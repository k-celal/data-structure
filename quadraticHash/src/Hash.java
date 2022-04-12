public class Hash {
    int key;
    int counter;
    int[] hasMap= new int[100];
    
    public void hashAdd(int value) {
        key=value%100;
        if(hasMap[key]!=0){
            counter++;
            if(quadraticProbing(value)==-1){
                System.out.println("List is full");
            }
            hasMap[quadraticProbing(value)]=value;
        }
        else{
            hasMap[key]=value;
        }
    }
    public int quadraticProbing(int value) {
        for (int i = 0; i < Math.sqrt(hasMap.length); i++) {
            key=(value+(i*i))%100;
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
    public int quadraticSearch(int value){
        key=value%100;
        if(hasMap[key]==value){
            return key;
        }else{
            for (int i = 0; i < hasMap.length; i++) {
                key=(value+(i*i))%100;
                if(hasMap[key]==value){
                    return key;
                }
                else{
                    counter++;
                    continue;
                }
            }
        }
        return -1;
    }
    public void Delete(int value) {
        if(quadraticSearch(value)==-1){
            System.out.println("Not Found");
        }else{
            hasMap[quadraticSearch(value)]=0;
        }
    }
}
