class Facebook extends Insta {

    void login() {
        System.out.println("\nFacebook Login");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    public static void main(String[] args) {
        Facebook f = new Facebook();
        f.login();
    }
}