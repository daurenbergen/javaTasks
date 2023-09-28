package GroupWorks2;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration user = new Registration();

        user.setEmail("dauren@yahoo.com");
        user.setUserName("daurentleu");
        user.setPassword("12345qwerty");

        System.out.println("Email: " + user.getEmail());
        System.out.println("Username: " + user.getUserName());
        System.out.println("Password: " + user.getPassword());
    }
}
