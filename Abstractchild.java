
public class Abstractchild extends Abstractiontut {

    public static void main(String[] args) {
        Abstractiontut obj = new Abstractchild();
        obj.display();
        obj.show();
    }

    @Override
    public void show() {
        System.out.println("This is the implementation of the abstract method");
    }
    @Override
    public void display() {
        System.out.println("This is the implementation of the display method");
    }
}