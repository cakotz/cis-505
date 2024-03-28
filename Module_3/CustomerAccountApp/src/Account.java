/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Account {
    //Account balance double and accessor.
    private double balance = 200;
    public double getBalance() {
        return balance;
    }

    //Deposits money into balance.
    public void deposit(double amt) {
        balance += amt;
    }

    //Withdraws money from balance or tell the user they have an invalid balance.
    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
        } else {
            System.out.println("Invalid balance.");
        }
    }

    //Displays a menu asking the user if they want to deposit, withdraw, or view their balance.
    public void displayMenu() {
        System.out.print("""
                Account Menu
                Enter <D/d> for deposit
                Enter <W/w> for withdraw
                Enter <B/b> for balance
                Enter option>:\s""");
    }

    //Returns the current date.
    public String getTransactionDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        return date.format(formatDate);
    }


}
