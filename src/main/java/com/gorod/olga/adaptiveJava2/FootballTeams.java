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

    public static class MatchResult {
        String team1;
        int score1;
        String team2;
        int score2;
        Results result1;
        Results result2;

        MatchResult(String team1, int score1, String team2, int score2) {
            this.team1 = team1;
            this.score1 = score1;
            this.team2 = team2;
            this.score2 = score2;
            setResults();
        }

        public static MatchResult of(String match) {
            String[] array = match.split(";");
            return new MatchResult(array[0], Integer.parseInt(array[1]), array[2], Integer.parseInt(array[3]));
        }

        public boolean isDraw() {
            return score1 == score2;
        }

        public Results getResult1() {
            return result1;
        }

        public Results getResult2() {
            return result2;
        }

        private void setResults() {
            if (score1 > score2) {
                result1 = Results.WIN;
                result2 = Results.DEFEAT;
            } else if (score2 > score1) {
                result1 = Results.DEFEAT;
                result2 = Results.WIN;
            } else {
                result1 = Results.DRAW;
                result2 = Results.DRAW;
            }
        }


    }

    public static void main(String[] args) {
        Map<String, TeamScore> teams = new HashMap<>();
        List<MatchResult> matchResults = new ArrayList<>();
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();
            for (int i = 0; i < num; i++) {
                matchResults.add(MatchResult.of(in.next()));
            }
        }
        for (MatchResult result : matchResults) {
            TeamScore overallScore1 = teams.computeIfAbsent(result.team1, t -> new TeamScore());
            TeamScore overallScore2 = teams.computeIfAbsent(result.team2, t -> new TeamScore());
            overallScore1.addGame(result.result1);
            overallScore2.addGame(result.result2);
            teams.put(result.team1, overallScore1);
            teams.put(result.team2, overallScore2);
        }

        teams.entrySet().stream().forEach(t -> System.out.println(t.getKey() + ":" + t.getValue()));
    }

    static class TeamScore {
        int totalGames = 0;
        int wins = 0;
        int draws = 0;
        int defeats = 0;
        int totalPoints = 0;

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

