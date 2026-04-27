import java.util.Scanner;

public class PersonalGreeting {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read user input

        System.out.println("Hello, " + name + "! Welcome to Java programming.");
        
        scanner.close(); // Good practice to close the scanner
    }
}
