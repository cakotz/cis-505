import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {
    /*
    String date - the date of the transaction, defaults to today's date
    String description - the description of the transaction
    double amount - the amount of the transactions
     */
    private String date = LocalDate.now().format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
    private String description = "";
    private double amount = 0;

    //Getters and setters for the date, description, and amount variables
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Default no argument constructor.
    Transaction() {
        description = "This is a default transaction.";
        amount = 0;
    }

    //Constructor with description and amount.
    Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }

    //Constructor with date, description, and amount.
    Transaction(String date, String description, double amount) {
        this.date = date;
        this.description = description;
        this.amount = amount;
    }

    //Override the toString method to return the data about the transaction.
    @Override
    public String toString() {
        return  "Date: " + date +
                "Description: " + description +
                "Amount: " + amount;
    }
}
