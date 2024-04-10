import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
    public static void main(String[] args) throws IOException {
        /*
        Scanner sc - Scanner object used to take user input.
        ArrayList<Transaction> transactions - Transaction object ArrayList, used in multiple switch cases.
        String input - Used to hold input from the user, used in multiple switch cases.
         */
        Scanner sc = new Scanner(System.in);
        ArrayList<Transaction> transactions = new ArrayList<>();
        String input = "";

        //Runs the program until the user doesn't want to continue.
        do {
            //Prompts the user to enter choose and option from the menu and assigns their response to the input String
            input = ValidatorIO.getString(sc, """
                    MENU OPTIONS
                    \s\s1. View Transaction
                    \s\s2. Add Transactions
                    \s\s3. View Expense
                                        
                    Please Choose an option:\s""");

            //Runs the users selected menu option.
            switch (input) {
                //Option 1: prints the total monthly expenses from the expense.txt file.
                case "1" -> {
                    transactions = TransactionIO.findAll();
                    System.out.println("MONTHLY EXPENSES");
                    for (Transaction transaction : transactions) {
                        System.out.println("\nDate: " + transaction.getDate());
                        System.out.println("Description: " + transaction.getDescription());
                        System.out.println("Amount: " + transaction.getAmount());
                    }
                }
                //Option 2: allows the user to enter one or more transactions.
                case "2" -> {
                    double amount = 0;

                    //Runs until the user doesn't want to add anymore transactions.
                    do {
                        //Prompts the user to enter a description and an amount.
                        input = ValidatorIO.getString(sc, "Enter the description: ");
                        amount = ValidatorIO.getDouble(sc, "Enter the amount: ");

                        //Creates a transaction object from the user input and adds it to the transactions ArrayList.
                        Transaction transaction = new Transaction(input, amount);
                        transactions.add(transaction);

                        //Asks the user if they want to add another transaction.
                        input = ValidatorIO.getString(sc, "\nAdd another transaction? (y/n): ");

                        while (!input.equals("y") && !input.equals("n")) {
                            input = ValidatorIO.getString(sc, "\nError! Invalid input, enter y or n: ");
                        }

                    } while (!input.equals("n"));

                    //Tries to use the bulkInsert method to add the transactions ArrayList to the expenses.txt file.
                    try {
                        TransactionIO.bulkInsert(transactions);
                    } catch (IOException e) {
                        System.out.println("\nException: " + e.getMessage());
                    }
                }
                //Option 3: prints all the transactions from the expenses.txt file
                case "3" -> {
                    //Uses the findAll method to add the transactions from the expenses.txt file to the transactions
                    // ArrayList
                    transactions = TransactionIO.findAll();
                    //double monthlyExpense - Used to add the total expense from the expenses.txt file
                    double monthlyExpense = 0;
                    for (Transaction transaction : transactions) {
                        monthlyExpense += transaction.getAmount();
                    }
                    System.out.println("Your total monthly expense is $" + monthlyExpense);
                }
                default -> System.out.println("\nError! Invalid input, enter 1, 2, or 3.");
            }

            //Asks the user if they want to continue and breaks the loop if they want to end.
            input = ValidatorIO.getString(sc, "Continue? (y/n): ");

            while (!input.equals("y") && !input.equals("n")) {
                input = ValidatorIO.getString(sc, "\nError! Invalid input, enter y or n: ");
            }

        } while (!input.equals("n"));
    }
}
