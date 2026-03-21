class Insta {
    String username = "bhuvan";
    String password = "0821";

    void login() {
        System.out.println("Instagram Login");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        Insta i = new Insta();
        i.login();

        Facebook f = new Facebook();
        f.login();
    }
}