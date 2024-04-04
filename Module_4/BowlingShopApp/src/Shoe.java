/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Shoe extends Product{
    //double size - size of shoe
    private double size = 0;

    //Size getter and setter.
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    //Default no argument constructor.
    Shoe() {
        size = 11.5;
    }

    //Override toString to concat size into product description on.
    String superString = toString();
    @Override
    public String toString() {
        return "Product code: " + getCode() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Color: " + size + "\n";
    }
}
