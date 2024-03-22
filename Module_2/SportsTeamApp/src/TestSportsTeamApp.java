/*
Kotz, C. (2024). CIS 505 Intermediate Java Programming. Bellevue University, all rights reserved.
 */

import java.util.Scanner;

public class TestSportsTeamApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Welcome to the Sports Team App\n" +
                               "\n" +
                               "Enter a team name: ");
            String teamName = sc.nextLine();

            System.out.println("\n" +
                               "Enter the player names: " +
                                 "hint: use commas for multiple players; no spaces>: ");
            String newPlayers = sc.nextLine();

            String[] players = newPlayers.split(",");

            Team newTeam = new Team(teamName);

            for (String player : players) {
                newTeam.addPlayer(player);
            }

            System.out.println("--Team Summary--\n" +
                               "Number of players in team: " + newTeam.getPlayerCount() + "\n" +
                               "Players on team: ");

            for (int i=0; i<newTeam.getPlayers().length; i++) {
                if (newTeam.getPlayers()[i] != null) {
                    System.out.print(newTeam.getPlayers()[i] + ",");
                }
            }

            System.out.println("\n" +
                               "Continue? (y/n): ");
            String input = sc.nextLine();
            if (input.equals("n")) {
                break;
            }
        }
    }
}
