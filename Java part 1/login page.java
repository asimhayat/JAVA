import java.util.Scanner;

class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String USERNAME = "asim";
        String PASSWORD = "hayat";

        System.out.println("Welcome to the Login System");

        System.out.print("Enter username: ");
        String usernameInput = scanner.nextLine();

        System.out.print("Enter password: ");
        String passwordInput = scanner.nextLine();
        if (usernameInput.equals(USERNAME) && passwordInput.equals(PASSWORD)) {
            System.out.println("Login successful. Welcome, " + USERNAME + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }
}