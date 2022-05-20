public class Hash {
    int key;
    int cakisma=0;
    int tekyerlesme=0;
    int yerdolu=0;
    int[] hasMap= new int[100];
    
    public void hashAdd(int value) {
        key=value%100;
        if(hasMap[key]!=0){
            
            if(linearProbing(value)==-1){
                System.out.println("List is full");
            }
            hasMap[linearProbing(value)]=value;
        }
        else{
            hasMap[key]=value;
            tekyerlesme++;
        }
    }
    public int linearProbing(int value){
        for (int i = 0; i < hasMap.length; i++) {
            cakisma++;
            key=(value+i)%100;
            if(hasMap[key]!=0){
                yerdolu++;
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
    public void linearDisplay(){
        for (int i = 0; i < hasMap.length; i++) {
            if(hasMap[i]==0){
                continue;
            }
            else{
                System.out.println(i + "-)" + hasMap[i]);
            }
        }
    }
    public void statictics(){
        System.out.println("Cakisma " + cakisma);
        System.out.println("Yer dolu : " + yerdolu);
        System.out.println("Tekte yerleşme " + tekyerlesme);       
    }
}
