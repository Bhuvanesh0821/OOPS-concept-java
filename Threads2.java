public class Threads2  extends Thread {
    public void run() {
        // MyClass2 m2 = new MyClass2();
        MyClass m1 = new MyClass();
        m1.printHello();
        // m2.printHello();
    }
    
}
