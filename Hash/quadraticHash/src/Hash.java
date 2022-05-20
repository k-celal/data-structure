public class Hash {
    int key;
    int cakisma=0;
    int tekyerlesme=0;
    int yerdolu=0;
    int[] hasMap= new int[100];
    
    public Hash() {
        for (int i = 0; i < hasMap.length; i++) {
            hasMap[i]=-1;
        }
    }
    public Boolean Full() {
        int counter= 0;
        for (int i = 0; i < hasMap.length; i++)
        {
            if(hasMap[i]==-1){
                continue;
            }
            else{
                counter++;
            }
        }
        if(counter==hasMap.length){
            return true;
        }
        else{
            return false;
        }
    }
    public void hashAdd(int value) {
        
        key=value%100;
        if(hasMap[key]!=-1){
            if(quadraticProbing(value)==-1){
                return;
            }
            hasMap[quadraticProbing(value)]=value;
        }
        else{
            hasMap[key]=value;
            tekyerlesme++;
        }
    }
    public int quadraticProbing(int value) {
        for (int i = 0; i < Math.sqrt(hasMap.length); i++) {
            cakisma++;
            key=(value+(i*i))%100;
            if(hasMap[key]!=-1){
                yerdolu++;
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
    public void quadraticDisplay(){
        for (int i = 0; i < hasMap.length; i++){
            System.out.println(i + "-)" + hasMap[i]);
        }
    }
        public void statictics(){
            if(Full()){
                System.out.println("ghj");
            }
            System.out.println("Cakisma " + cakisma);
            System.out.println("Yer dolu : " + yerdolu);
            System.out.println("Tekte yerleşme " + tekyerlesme);       
        }
}