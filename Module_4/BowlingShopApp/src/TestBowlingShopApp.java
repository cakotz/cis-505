/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

import java.util.Scanner;

public class TestBowlingShopApp {
    public static void main(String[] args) {
        //Creates a scanner object to accept input from the user.
        Scanner sc = new Scanner(System.in);

        //Prompts the user to choose from the options until they choose to exit.
        while (true) {
            System.out.print("""
                    MENU OPTIONS
                      1. <b> Bowling Balls
                      2. <a> Bowling Bags
                      3. <s> Bowling Shoes
                      4. <x> To exit
                      
                    Please choose an option:\s""");

            String choice = "";
            choice = sc.next();

            System.out.print("\n");

            //Takes the users input and either creates a GenericQueue of the selected item from the database or exits.
            if (choice.equals("x")) {
                break;
            } else {
                GenericQueue<Product> GenericQueue = ProductDB.getProduct(choice);

                while (GenericQueue.size() > 0) {
                    System.out.print(GenericQueue.dequeue() + "\n");
                }
            }
        }
    }
}
