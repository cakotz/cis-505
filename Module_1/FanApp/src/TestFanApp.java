public class TestFanApp {
    public static void main(String args[]) {
        Fan fanOne = new Fan();
        Fan fanTwo = new Fan(Fan.MEDIUM, true, 8, "blue");

        System.out.println(fanOne);
        System.out.println(fanTwo);
    }
}
