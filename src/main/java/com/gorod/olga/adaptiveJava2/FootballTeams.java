package com.gorod.olga.adaptiveJava2;

import java.util.*;
import java.util.regex.Pattern;

/**
 * Given a list of football teams with the result of the match. Output the summary table of the results
 * of all matches.
 * <p>
 * The team gets 3 points for winning, 0 points for loosing, 1 point for draw.
 * <p>
 * Input format:
 * <p>
 * The first line specifies the integer nn — the number of completed games.
 * After this follow the nn lines, which contain the game results in the following format:
 * First_team;Goals_by_first_team;Second_team;Goals_by_second_team
 * Output of your program should look like the following:
 * Team:Total_games Wins Draws Defeats Total_points
 * <p>
 * You can output teams in an arbitrary order.
 * <p>
 * Sample Input:
 * <p>
 * 3
 * Zenit;3;Spartak;1
 * Spartak;1;CSKA;1
 * CSKA;0;Zenit;2
 * Sample Output:
 * <p>
 * Spartak:2 0 1 1 1
 * Zenit:2 2 0 0 6
 * CSKA:2 0 1 1 1
 */

public class FootballTeams {
    public enum Results {
        WIN,
        DRAW,
        DEFEAT
    }

    public static void main(String[] args) {
        Map<String, TeamScore> teams = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.useDelimiter(Pattern.compile(";|\n"));
        for (int i = 0; i < num; i++) {
            String team1 = in.next();
            int gameScore1 = Integer.parseInt(in.next());
            TeamScore overallScore1 = teams.containsKey(team1) ? teams.get(team1) : new TeamScore();
            String team2 = in.next();
            int gameScore2 = Integer.parseInt(in.next());
            TeamScore overallScore2 = teams.containsKey(team2) ? teams.get(team2) : new TeamScore();
            if (gameScore1 > gameScore2) {
                overallScore1.addGame(Results.WIN);
                overallScore2.addGame(Results.DEFEAT);
            } else if (gameScore1 < gameScore2) {
                overallScore1.addGame(Results.DEFEAT);
                overallScore2.addGame(Results.WIN);
            } else {
                overallScore1.addGame(Results.DRAW);
                overallScore2.addGame(Results.DRAW);
            }
            teams.put(team1, overallScore1);
            teams.put(team2, overallScore2);
        }
            teams.entrySet().stream().forEach(t -> System.out.println(t.getKey() + ":" + t.getValue()));
    }

    static class TeamScore {
        int totalGames;
        int wins;
        int draws;
        int defeats;
        int totalPoints;

        {
            totalGames = 0;
            wins = 0;
            draws = 0;
            defeats = 0;
            totalPoints = 0;
        }

        @Override
        public String toString() {
            return totalGames +
                    " " + wins +
                    " " + draws +
                    " " + defeats +
                    " " + totalPoints;
        }

        public void addGame(Results result) {
            totalGames++;
            switch (result) {
                case WIN: {
                    wins++;
                    totalPoints = totalPoints + 3;
                    break;
                }
                case DRAW: {
                    draws++;
                    totalPoints++;
                    break;
                }
                case DEFEAT: {
                    defeats++;
                    break;
                }
            }
        }
    }
}

