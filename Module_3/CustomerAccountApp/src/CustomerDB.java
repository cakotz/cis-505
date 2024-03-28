/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class CustomerDB {
    //Returns a customer based on the id variable.
    public static Customer getCustomer(int id) {
        if (id == 1007) {
            return new Customer("Bob Dylan", "527 Hurricane Rd", "New York", "68493");
        } else if (id == 1008) {
            return new Customer("Jimi Hendrix", "860 Watch Tower Dr", "LA", "10493");
        } else if (id == 1009) {
            return new Customer("Led Zeppelin", "6930 Levee Break Cr", "Omaha", "68133");
        } else {
            return new Customer();
        }
    }
}
