public class App {
    public static void main(String[] args) throws Exception {
        Hash hs =  new Hash();
        hs.hashAdd(89652);
        hs.hashAdd(96362);
        hs.hashAdd(96372);  
        hs.hashAdd(96392);
        hs.hashAdd(96342);
        hs.hashAdd(96322);
        hs.hashAdd(96312);
        hs.hashAdd(96332);
        hs.hashAdd(89752);
       System.out.println( hs.linearSearch(89752));
        return;
        
    }

}
