/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Customer {
    /*
    Create the variable:
    name - The customer's name
    address - The customer's address
    city - The customer's city
    zip - The customer's zip code
     */
    private String name;
    private String address;
    private String city;
    private String zip;

    //No argument default constructor.
    Customer() {
        name = "Collin Kotz";
        address = "109 Longwood Dr";
        city = "Papillion";
        zip = "68133";
    }

    //Argument constructor.
    Customer(String name, String address, String city, String zip) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.zip = zip;
    }

    //Overrides the toString to output the customer's info.
    public String toString() {
        return "--Customer Details--\n" +
                "Name : " + name + "\n" +
                "Address: " + address + "\n" +
                "City: " + city + "\n" +
                "Zip: " + zip + "\n";
    }
}
