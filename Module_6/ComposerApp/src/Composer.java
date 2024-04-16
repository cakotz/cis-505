/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Composer {
    /*

     */
    private int id = 0;
    private String name = "";
    private String genre = "";

    //Getters and setters for id, name, and genre.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    //Default constructor and argument constructor.
    Composer() {}
    Composer(int id, String name, String genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "\nId: " + id + "\n" +
                "Name: " + name + "\n" +
                "Genre: " + genre + "\n";
    }
}
