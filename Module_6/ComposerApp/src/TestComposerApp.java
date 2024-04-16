import java.util.List;
import java.util.Scanner;
/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */


import static java.lang.Integer.parseInt;

public class TestComposerApp {
    public static void main(String[] args) {
        //Creates a scanner object to get user input and a MemComposerDao object to handle composer information.
        Scanner sc = new Scanner(System.in);
        MemComposerDao mem = new MemComposerDao();

        /*
        int id - the id of the composer
        String name - the name of the composer
        String genre - the genre of the composer
         */
        int id;
        String name;
        String genre;

        System.out.print("Welcome to the Composer App\n\n");

        //Runs the program until the user chooses to exit.
        boolean run = true;
        while (run) {
            //Prompts the user to choose and option.
            System.out.print("""
                    
                    MENU OPTION
                      1. View Composers
                      2. Find Composers
                      3. Add Composer
                      4. Exit
                      
                    Please choose an option:\s""");

            //Uses the input from the user to select an option.
            switch (sc.nextLine()) {
                //Displays all the composers from the composers list in the memComposerDao object.
                case "1" -> {
                    List<Composer> composers = mem.findAll();
                    for (Composer composer : composers) {
                        System.out.print(composer);
                    }
                }
                //Displays a composer from the composers list in the memComposerDao object that matches the id entered
                // by the user.
                case "2" -> {
                    System.out.print("\nEnter an id: ");
                    id = parseInt(sc.nextLine());
                    Composer composer = mem.findBy(id);
                    System.out.print("\n--DISPLAYING COMPOSER--");
                    System.out.print(composer);
                }
                //Lets the user input information for a new composer and creates a composer object and adds it to the
                // composers list in the memComposerDao object.
                case "3" -> {
                    System.out.print("\nEnter an id: ");
                    id = parseInt(sc.nextLine());
                    System.out.print("\nEnter a name: ");
                    name = sc.nextLine();
                    System.out.print("\nEnter a genre: ");
                    genre = sc.nextLine();
                    Composer composerInput = new Composer(id, name, genre);
                    mem.insert(composerInput);
                }
                //Sets run too false to end the program.
                case "4" -> run = false;
            }
        }
    }
}
