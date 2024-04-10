import java.util.Scanner;

public class ValidatorIO {
    /*
    Uses the prompt String to prompt the user to input a response and validates that it is an int then returns the user
    input as an int.
     */
    public static int getInt(Scanner sc, String prompt) {
        int input = 0;
        boolean isValid = false;

        //Repeats the prompt until the user enters an int.
        while (!isValid) {
            System.out.println(prompt);

            //If the input is an int set input to the user input and set isValid to true, else return an error message.
            if (sc.hasNextInt()) {
                input = sc.nextInt();
                isValid = true;
            } else {
                System.out.println("\n  Error! Invalid integer value.\n");
            }

            sc.nextLine();
        }

        return input;
    }

    /*
    Uses the prompt String to prompt the user to input a response and validates that it is a double then returns the
    user input as a double.
     */
    public static double getDouble(Scanner sc, String prompt) {
        double input = 0;
        boolean isValid = false;

        //repeats the prompt until the user enters a double.
        while (!isValid) {
            System.out.println(prompt);

            //If the input is a double set input to the user input and set isValid to true, else return an error message.
            if (sc.hasNextDouble()) {
                input = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("\n  Error! Invalid double value.\n");
            }

            sc.nextLine();
        }

        return input;
    }

    /*
    Uses the prompt String to prompt the user to enter a response and returns the user input as a string using the
    Scanner object
     */
    public static String getString(Scanner sc, String prompt) {
        System.out.println(prompt);

        return sc.nextLine();
    }
}
