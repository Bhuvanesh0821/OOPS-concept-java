public class Personalinfo {

    static class Customer {
        private int id;
        private String name;
        private String email;

        Customer(int id, String name, String email) {
            this.id = id;
            this.name = name;
            this.email = email;
        }

        void display() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
        }
    }

    public static void main(String[] args) {
        Customer c1 = new Customer(101, "Bhuvanesh", "bhuvan@gmail.com");
        c1.display();
    }
}
