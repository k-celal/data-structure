import java.util.Arrays;

public class HashTableQuadraticProbing {

    private int[] htable;

    public HashTableQuadraticProbing(int size) {
        this.htable = new int[size];
    }

    public int hash(int x) {
        return x * x % htable.length;
    }

    public void insert(int x) {
        int i = hash(x);
        int j = 1;
        while (htable[i] != 0) {
            i=(i+(j*j))%htable.length;
            j++;
        }
        htable[i] = x;
    }

    public void print() {
        System.out.println(Arrays.toString(htable));
    }

    public static void main(String[] args) {
        HashTableQuadraticProbing htable = new HashTableQuadraticProbing(11);
        htable.insert(5);
        htable.insert(8);
        htable.insert(12);
        htable.insert(13);
        htable.insert(6);
        htable.insert(14);
        htable.print();
    }
}
