
public class Game {

    private String homeTeam;
    private String visitingTeam;
    private int homeTeamPoints;
    private int visitingTeamPoints;

    public Game() {
    }

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints) {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam() {
        return this.homeTeam;
    }

    public String getVisitingTeam() {
        return this.visitingTeam;
    }

    public int getHomeTeamPoints() {
        return this.homeTeamPoints;
    }

    public int getVisitingTeamPoints() {
        return this.visitingTeamPoints;
    }

    public boolean isHomeTeamWinner() {
        return this.homeTeamPoints > this.visitingTeamPoints;
    }

    public boolean isVisitingTeamWinner() {
        return this.visitingTeamPoints > this.homeTeamPoints;
    }

    @Override
    public String toString() {
        return this.homeTeam + "," + this.visitingTeam + "," + this.homeTeamPoints + "," + this.visitingTeamPoints;
    }
}
