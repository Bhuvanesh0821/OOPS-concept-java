public class Threads1  extends Thread {
    public void run() {
        MyClass2 m2 = new MyClass2();
        // MyClass m1 = new MyClass();
        // m2.printHello();
        m2.printHello();
    }
    
}
