import java.util.Scanner;

public class DoArithmeticOperations {

    // Main method

    public static void main(String[] args) {

        // Scanner class

        Scanner scanner = new Scanner(System.in);

        int choice;

        // Do while loop

        do {
            System.out.println("1. ADDITION");
            System.out.println("2. SUBTRACTION");
            System.out.println("3. MULTIPLICATION");
            System.out.println("4. DIVISION");
            System.err.println("5. MODULUS");
            System.out.println("6. EXIT");
            System.out.print("ENTER YOUR CHOICE: ");

            // Get user input

            choice = scanner.nextInt();

            // If statement if user wants to exit

            if (choice == 6) {
                break;
            }

            System.out.print("ENTER FIRST NUMBER : ");
            double number1 = scanner.nextDouble();

            System.out.print("ENTER SECOND NUMBER : ");
            double number2 = scanner.nextDouble();

            // Switch statement

            switch (choice) {
                case 1:
                    System.out.println("ADDITION RESULT : " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("SUBTRACTION RESULT : " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("MULTIPLICATION RESULT : " + (number1 * number2));
                    break;
                case 4:

                    // If statement if user wants to divide by zero

                    if (number2 != 0) {
                        System.out.println("DIVISION RESULT : " + (number1 / number2));
                    } else {
                        System.out.println("ERROR : CANNOT DIVIDE BY ZERO.");
                    }
                    break;

                case 5:
                    System.out.println("MODULUS RESULT : " + (number1 % number2));
                    break;

                // Default case

                default:
                    System.out.println("INVALID CHOICE. PLEASE TRY AGAIN.");
                    break;
            }

            // Print if user wants to perform another operation

            System.out.println("DO YOU WANT TO PERFORM ANOTHER OPERATION? (Y/N) : ");

            // Get user input

            char continueChoice = scanner.next().charAt(0);

            // Check if user wants to perform another operation

            choice = (continueChoice == 'Y' || continueChoice == 'y') ? 1 : 5;

            System.out.println();

            // If user does not want to perform another operation, print exit message

        } while (choice != 5);

        System.out.println("EXITING PROGRAM. THANK YOU!");
        scanner.close();
    }
}
