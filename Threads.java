public class Threads {
    public static void main(String[] args) {
        Threads1 t1 = new Threads1();
        Threads2 t2 = new Threads2();
        t1.start();
        t2.start();
    }
    
}
