
   public  class Constructor {
    int id; 
    String name; 
    String phone;

    Constructor(int i, String n, String p) {
        id = i;
        name = n;
        phone = p;
    }

    void show() {
        System.out.println(id + " " + name + " " + phone);
    }

    public static void main(String[] args) {
        Constructor c = new Constructor(101, "Bhuvanesh", "8056766856");
        c.show();
    }
}
    

