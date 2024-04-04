/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Product {
    /*
    String code - Product code
    String description - description of product
    double price - price of product
     */
    private String code = "";
    private String description = "";
    private double price = 0;

    //Code getter and setter.
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    //Description getter and setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //price getter and setter
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    //Default no argument constructor
    Product() {
        code = "0";
        description = "12 oz Coke";
        price = 5.99;
    }

    //Override the toString method to display product info.
    @Override
    public String toString() {
        return "Product code: " + code + "\n" +
                "Description: " + description + "\n" +
                "Price: " + price + "\n";
    }
}
