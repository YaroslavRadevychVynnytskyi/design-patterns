package patterns.structural.proxy.example2;

import java.util.Scanner;

import patterns.structural.proxy.example2.db.DatabaseService;
import patterns.structural.proxy.example2.db.DatabaseServiceProxy;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DatabaseService database = new DatabaseServiceProxy();

        while (true) {
            System.out.println("Enter username to search for: ");
            String usernameInput = scanner.nextLine();

            String userData = database.getUserData(usernameInput, "ROLE_USER");
            System.out.println("Received user data: " +  userData);
        }
    }
}
