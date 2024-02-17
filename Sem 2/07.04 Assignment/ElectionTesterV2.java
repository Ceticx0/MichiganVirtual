// Gavin Perry, 2024-2-15, The purpose of this program is to test the Candidate class by traversing through an araylist of candidates and performing actions.

import java.util.ArrayList;
public class ElectionTesterV2
 {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<Candidate>();
        candidates.add(new Candidate("Gaming Johnson", 6000));
        candidates.add(new Candidate("Grace Grace", 2400));
        candidates.add(new Candidate("ROB Robber", 1800));
        candidates.add(new Candidate("Obma Hussein", 3200));
        candidates.add(new Candidate("Hananh Montana", 20000));

        System.out.println("Raw Results:");
        printVotes(candidates);
        System.out.println();
        int totalVotes = countVotes(candidates);
        printTable(candidates, totalVotes);
        System.out.println("Total votes: " + totalVotes);
    }

    public static void printVotes(ArrayList<Candidate> candidates) {
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }

    public static int countVotes(ArrayList<Candidate> candidates) {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getVotes();
        }
        return totalVotes;
    }

    public static void printTable(ArrayList<Candidate> candidates, int totalVotes) {
        System.out.println("Candidate\tVotes\t% of Total");
        System.out.println("==================================");
        for (Candidate candidate : candidates) {
            System.out.printf("%s\t%d\t%.2f%n", candidate.getName(), candidate.getVotes(), ((double)candidate.getVotes() / totalVotes) * 100);
        }
    }
}
