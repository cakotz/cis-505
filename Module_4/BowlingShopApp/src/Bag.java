/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Bag extends Product{
    //String type - type of bag
    private String type = "";

    //Type getter and setter.
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    //Default no argument constructor.
    Bag() {
        type= "plastic";
    }

    //Override toString to concat type into product description on.
    String superString = toString();
    @Override
    public String toString() {
        return "Product code: " + getCode() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Color: " + type + "\n";
    }
}

