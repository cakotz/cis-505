public class Fan {
    //Creates four constants to represent the speed of a fan.
    static final int STOPPED = 0;
    static final int SLOW = 1;
    static final int MEDIUM = 2;
    static final int HIGH = 3;

    //The speed integer is used to set the speed of a fan.
    private int speed = STOPPED;
    //The on boolean is used to determine if a fan is off or on.
    private boolean on = false;
    //The radius double is used to set the radius of a fan.
    private double radius = 6;
    //The color string is used to set the color of a fan.
    private String color = "white";

    //Getters and setters for speed, on, radius, and color.
    int getSpeed() {
        return speed;
    }
    void setSpeed(int speed) {
        this.speed = speed;
    }
    boolean getOn() {
        return on;
    }
    void setOn(boolean on) {
        this.on = on;
    }
    double getRadius() {
        return radius;
    }
    void setRadius(double radius) {
        this.radius = radius;
    }
    String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }

    //No-argument constructor
    Fan() {}

    //Constructor for the Fan class
    Fan(int speed, boolean on, double raidus, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String toString() {
        if (on) {
            return "The fan is set to " + speed + " with a color of " + color + " and a radius of " + radius + ".";
        } else {
            return "The fan is " + color + " with a radius of " + radius + " and the fan is off.";
        }
    }
}
