package io.tince.exercises.easy;

// Tournament Winner
// There's an algorithms tournament taking place in which teams of programmers compete against each other to solve algorithmic problems
// as fast as possible. Teams compete in a round-robin, where each team faces off against all other teams. Only two teams compete against
// each other at a time, and for each competition, one team is designated the home team, while the other team is the away team.
// In each competition there's always one winner and one loser; there are no ties. A team receives 3 points if it wins and 0 points if it loses.
// The winner of the tournament is the team that receives the most amount of points.

// Given an array of pairs representing the teams that have competed against each other and an array containing the results of each competition,
// write a function that returns the winner of the tournament. The input arrays are named competitions and results, respectively.
// The competitions array has elements in the form of [homeTeam, awayTeam], where each team is a string of at most 30 characters representing the name of the team
// The "results" array contains information about the winner of each corresponding competition in the "competitions" array. Specifically,
// "results[i]" denotes the winner of competitions[i], where a "1" in the results array means that the home team in the corresponding competition won
// and a "0" means that the away team won.

import java.util.*;

// It's guaranteed that exactly one team will win the tournament and that each team will compete against all other teams exactly once.
// It's also guaranteed that the tournament will always have at least two teams.
public class TournamentWinner {
    public static void main(String[] args) {
        // [homeTeam, awayTeam]
        List<List<String>> competitions = List.of(List.of("HTML", "C#"), List.of("C#", "Python"), List.of("Python", "HTML"));
        List<List<String>> competitions2 = List.of(List.of("Bulls", "Eagles#"));
        List<Integer> results = List.of(0, 0, 1);
        System.out.println(tournamentWinner2(competitions, results));
    }

    public static String tournamentWinner(List<List<String>> competitions, List<Integer> results) {
        // Write your code here.
        Map<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < competitions.size(); i++) {
            String winnerKey = results.get(i) == 0 ? competitions.get(i).get(1) : competitions.get(i).get(0);
            if (!resultMap.containsKey(winnerKey)) {
                resultMap.put(winnerKey, 1);
            } else {
                int point = resultMap.get(winnerKey);
                resultMap.put(winnerKey, ++point);
            }
        }
        Integer maxValue = Collections.max(resultMap.values());
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            if (Objects.equals(entry.getValue(), maxValue)) {
                return entry.getKey();
            }
        }
        return "";
    }

    public static String tournamentWinner2(List<List<String>> competitions, List<Integer> results) {
        // Write your code here.
        Map<String, Integer> competitorsPointMap = new HashMap<>();
        String result = "";
        for (int i = 0; i < competitions.size(); i++) {
            List<String> strings = competitions.get(i);
            for (String s : strings) {
                competitorsPointMap.put(s, 0);
            }
        }

        for (int i = 0; i < competitions.size(); i++) {
            int winner = results.get(i);
            String winnerSide = winner == 0 ? competitions.get(i).get(1) : competitions.get(i).get(0);
            competitorsPointMap.put(winnerSide, competitorsPointMap.get(winnerSide) + 3);
        }

        int point = 0;

        for (String c : competitorsPointMap.keySet()) {
            Integer value = competitorsPointMap.get(c);
            if (value > point) {
                point = value;
                result = c;
            }
        }

        return result;
    }

    public String tournamentWinner3(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        // Write your code here.
        String currentBestTeam = "";
        final int HOME_TEAM_WON = 1;
        Map<String, Integer> scores = new HashMap<>();
        scores.put(currentBestTeam, 0);

        for (int i = 0; i < competitions.size(); i++) {
            List<String> competition = competitions.get(i);
            Integer result = results.get(i);

            String homeTeam = competition.get(0);
            String awayTeam = competition.get(1);

            String winningTeam = (result == HOME_TEAM_WON) ? homeTeam : awayTeam;

            updateScores(winningTeam, scores);

            if (scores.get(winningTeam) > scores.get(currentBestTeam)) {
                currentBestTeam = winningTeam;
            }
        }
        return currentBestTeam;
    }

    private void updateScores(String team, Map<String, Integer> scores) {
        if (!scores.containsKey(team)) {
            scores.put(team, 0);
        }

        scores.put(team, scores.get(team) + 3);
    }
}