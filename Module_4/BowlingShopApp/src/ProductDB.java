/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

import java.util.Queue;

public class ProductDB {
    public static GenericQueue<Product> getProduct(String code) {
        switch (code) {
            //If code equals "b" create 5 ball objects and enqueue them into a GenericQueue<Product> object.
            case "b" -> {
                Ball ball1 = new Ball();
                ball1.setCode("B100");
                ball1.setDescription("Black Widow 2.0");
                ball1.setPrice(144.95);
                ball1.setColor("Black and Red");

                Ball ball2 = new Ball();
                ball2.setCode("B101");
                ball2.setDescription("Black Widow 3.0");
                ball2.setPrice(244.95);
                ball2.setColor("Black and Blue");

                Ball ball3 = new Ball();
                ball3.setCode("B102");
                ball3.setDescription("Black Widow 4.0");
                ball3.setPrice(344.95);
                ball3.setColor("Black and White");

                Ball ball4 = new Ball();
                ball4.setCode("B103");
                ball4.setDescription("Black Widow 5.0");
                ball4.setPrice(444.95);
                ball4.setColor("Black and Purple");

                Ball ball5 = new Ball();
                ball5.setCode("B104");
                ball5.setDescription("Black Widow 6.0");
                ball5.setPrice(544.95);
                ball5.setColor("Black and Orange");

                GenericQueue<Product> balls = new GenericQueue<>();
                balls.enqueue(ball1);
                balls.enqueue(ball2);
                balls.enqueue(ball3);
                balls.enqueue(ball4);
                balls.enqueue(ball5);

                return balls;
            }
            //If code equals "s" create 5 shoe objects and enqueue them into a GenericQueue<Product> object.
            case "s" -> {
                Shoe shoe1 = new Shoe();
                shoe1.setCode("S100");
                shoe1.setDescription("Dragonfly 1.0");
                shoe1.setPrice(149.99);
                shoe1.setSize(9);

                Shoe shoe2 = new Shoe();
                shoe2.setCode("S101");
                shoe2.setDescription("Dragonfly 2.0");
                shoe2.setPrice(249.99);
                shoe2.setSize(10);

                Shoe shoe3 = new Shoe();
                shoe3.setCode("S102");
                shoe3.setDescription("Dragonfly 3.0");
                shoe3.setPrice(349.99);
                shoe3.setSize(11);

                Shoe shoe4 = new Shoe();
                shoe4.setCode("S103");
                shoe4.setDescription("Dragonfly 4.0");
                shoe4.setPrice(449.99);
                shoe4.setSize(12);

                Shoe shoe5 = new Shoe();
                shoe5.setCode("S104");
                shoe5.setDescription("Dragonfly 5.0");
                shoe5.setPrice(549.99);
                shoe5.setSize(13.5);

                GenericQueue<Product> shoes = new GenericQueue<>();
                shoes.enqueue(shoe1);
                shoes.enqueue(shoe2);
                shoes.enqueue(shoe3);
                shoes.enqueue(shoe4);
                shoes.enqueue(shoe5);

                return shoes;
            }
            //If code equals "a" create 3 bag objects and enqueue them into a GenericQueue<Product> object.
            case "a" -> {
                Bag bag1 = new Bag();
                bag1.setCode("B100");
                bag1.setDescription("Bag One");
                bag1.setPrice(9.99);
                bag1.setType("Plastic");

                Bag bag2 = new Bag();
                bag1.setCode("B101");
                bag1.setDescription("Bag Two");
                bag1.setPrice(19.99);
                bag1.setType("Paper");

                Bag bag3 = new Bag();
                bag1.setCode("B102");
                bag1.setDescription("Bag Three");
                bag1.setPrice(29.99);
                bag1.setType("Cloth");

                GenericQueue<Product> bags = new GenericQueue<>();
                bags.enqueue(bag1);
                bags.enqueue(bag2);
                bags.enqueue(bag3);

                return bags;
            }
            //If code doesn't match options create a default product and enqueue it into a GenericQueue<Product> object.
            default -> {
                Product product = new Product();

                GenericQueue<Product> products = new GenericQueue<>();
                products.enqueue(product);

                return products;
            }
        }
    }
}
