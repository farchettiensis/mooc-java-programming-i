
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("File:");
        String fileName = scanner.nextLine();

        ArrayList<Game> games = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            while (fileReader.hasNextLine()) {
                String row = fileReader.nextLine();
                String[] parts = row.split(",");

                String homeTeam = parts[0];
                String visitingTeam = parts[1];
                int homeTeamPoints = Integer.parseInt(parts[2]);
                int visitingTeamPoints = Integer.parseInt(parts[3]);

                games.add(new Game(homeTeam, visitingTeam, homeTeamPoints, visitingTeamPoints));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        int gamesPlayed = 0;
        int wins = 0;
        int losses = 0;

        for (Game game : games) {
            if (game.getHomeTeam().equals(teamName) || game.getVisitingTeam().equals(teamName)) {
                gamesPlayed++;
                if ((game.getHomeTeam().equals(teamName) && game.isHomeTeamWinner())
                        || (game.getVisitingTeam().equals(teamName) && game.isVisitingTeamWinner())) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

}
