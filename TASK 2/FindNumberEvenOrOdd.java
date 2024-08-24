import java.util.Scanner;

public class FindNumberEvenOrOdd {

    // Main method

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME TO EVEN OR ODD NUMBER CHECKER.");

        int choice;

        // Do while loop

        do {
            System.out.print("ENTER A NUMBER : ");
            int number = scanner.nextInt();

            // If statement

            if (number % 2 == 0) {

                // Print if number is even

                System.out.println(number + " IS AN EVEN NUMBER.");
            } else {

                // Print if number is odd

                System.out.println(number + " IS AN ODD NUMBER.");
            }

            // Print if user wants to check another number

            System.out.println("DO YOU WANT TO CHECK ANOTHER NUMBER? (Y/N) : ");

            // Get user input

            char continueChoice = scanner.next().charAt(0);

            // Check if user wants to check another number

            choice = (continueChoice == 'Y' || continueChoice == 'y') ? 1 : 0;

        } while (choice == 1);

        // If user does not want to check another number, print exit message

        System.out.println("EXITING PROGRAM. THANK YOU!");
        scanner.close();
    }
}
