/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

public class Team {

    //Creates the private variables teamName, players, and playerCount.
    private String teamName = "";
    private String[] players = new String[20];
    private int playerCount = 0;

    //Argument constructor that uses the teamName variable as an argument.
    Team(String teamName) {
        this.teamName = teamName;
    }

    //The addPlayer method takes a player string argument and adds it to the players array.
    public void addPlayer(String player) {
        players[playerCount] = player;
        playerCount++;
    }

    //The getPlayers method returns the players array.
    public String[] getPlayers() {
        return players;
    }

    //The getPlayerCount method returns the player count.
    public int getPlayerCount() {
        return playerCount;
    }

    //The getTeamName method returns the team name.
    public String getTeamName() {
        return teamName;
    }
}
