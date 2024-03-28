/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class TestCustomerAccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompts the user to enter a customer id and creates the Integer id from the input
        System.out.print("""
                Welcome to the Customer Account App

                Enter a customer ID:  ex: 1007, 1008, 1009>:\s""");
        int id = parseInt(sc.next());

        //Creates an account for the customer.
        Account account = new Account();

        //Loops through the selection until the user decides not to continue.
        while(true) {
            System.out.print("\n");
            //Displays the selection menu.
            account.displayMenu();

            //Takes the input from the user and verifies that it is a valid selection.
            String selection;
            while (true) {
                selection = sc.next();

                if (selection.equals("D") || selection.equals("d") ||
                        selection.equals("W") || selection.equals("w") ||
                        selection.equals("B") || selection.equals("b")) {
                    break;
                }

                System.out.print("""

                        Error: Invalid Option
                          Enter option>:\s""");
            }

            double amt = 0;
            //Displays the selection of the user.
            if (selection.equals("D") || selection.equals("d")) {
                //Allows the user to deposit into their account.
                System.out.print("""
                        
                        Enter a deposit amount: \s""");
                amt = parseInt(sc.next());
                account.deposit(amt);

            } else if (selection.equals("W") || selection.equals("w")) {
                //Allows the user to withdraw from their account.
                System.out.print("""
                        
                        Enter a withdraw amount:\s""");
                amt = parseInt(sc.next());
                account.withdraw(amt);
            } else {
                //Allows the user to check the balance of their account.
                System.out.print("\n" +
                                 "Account balance: " + account.getBalance());
            }

            //Asks the user if they want to continue.
            System.out.print("""
                    
                    Continue? (y/n):\s""");
            String yOrN = sc.next();

            if (yOrN.equals("n")) {
                break;
            }
        }

        //Outputs the users information and balance.
        System.out.print("\n");
        System.out.print(CustomerDB.getCustomer(id));
        System.out.print("\n");
        System.out.print("Balance as of " + account.getTransactionDate() + " is " + account.getBalance());
    }
}
