public class App {
    public static void main(String[] args) {

        Queue queue  = new Queue(5);
        queue.enQueue(15);
        queue.enQueue(25);
        queue.enQueue(135);
        queue.enQueue(14);
        queue.enQueue(19);
        System.out.println(queue.size());
        queue.deQueue();
        System.out.println(queue.size());

        queue.Peek();
        
    }
    
}
