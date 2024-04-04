/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Ball extends Product{
    //String color - color of ball
    private String color = "";

    //Color getter and setter.
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Default no argument constructor.
    Ball() {
        color = "red";
    }

    //Override toString to concat color into product description on.
    @Override
    public String toString() {
        return "Product code: " + getCode() + "\n" +
                "Description: " + getDescription() + "\n" +
                "Price: " + getPrice() + "\n" +
                "Color: " + color + "\n";
    }
}
