import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Hash hs = new Hash();
        Random rnd = new Random();
        int value;
        for (int i = 0; i < 100; i++) {
            value=10000+rnd.nextInt(90000);
            hs.hashAdd(value);
        }
        hs.quadraticDisplay();
        hs.statictics();
        System.out.println();
        return;
        
    }
}
