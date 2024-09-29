import java.util.Scanner;
// Scanner object: The Scanner class is used to take input from the user.
public class MinutesConversion {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of minutes
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        // Convert minutes to hours and days
        int hours = minutes / 60;
        double days = minutes / (60.0 * 24);

        // Display the result
        System.out.println(minutes + " minutes equals " + hours + " hours and " + days + " days.");

        // Close the scanner
        scanner.close();
    }
}