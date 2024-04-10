import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    /*
    String FILE_NAME - Holds the name of the file being accessed
    File file - Creates a File object from the FILE_NAME String.
     */
    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    //Inserts the data from Transaction objects from an ArrayList into the file File object.
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException {
        PrintWriter output = null;

        //If the file exists starts a FileOutputStream to the file, else it creates a new file.
        if (file.exists()) {
            output = new PrintWriter(new FileOutputStream(new File(FILE_NAME), true));
        } else {
            output = new PrintWriter(FILE_NAME);
        }

        //Loops through the Transactions ArrayList and adds the data, description, and amount from each Transaction
        // object to the file.
        for (Transaction tran : transactions) {
            output.print(tran.getDate() + ";");
            output.print(tran.getDescription() + ";");
            output.println(tran.getAmount());
        }

        output.close();
    }

    //Takes the data from the file and creates an ArrayList of Transaction objects from the data.
    public static ArrayList<Transaction> findAll() throws IOException {
        ArrayList<Transaction> transactions = new ArrayList<>();

        Scanner input = new Scanner(file);

        //Loops through each line of the file and put the data into a Transaction object and adds the object to the
        // Transactions ArrayList.
        while (input.hasNext()) {
            String line = input.nextLine();
            //String[] transactionData - Used to hold the data for from a line in the file for the Transaction object.
            String[] transactionData = line.split(";", 3);

            //Creates a Transaction object and adds it to the Transactions ArrayList.
            Transaction tran = new Transaction(transactionData[0], transactionData[1], Double.parseDouble(transactionData[2]));
            transactions.add(tran);
        }

        return transactions;
    }
}
