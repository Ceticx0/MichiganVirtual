// Gavin Perry, 2024-2-16, The purpose of this program is to test the Candidate class by traversing through an ArrayList of candidates and performing actions to them.
import java.util.ArrayList;

public class ElectionTesterV6 {
    public static void main(String[] args) {
        ArrayList<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Gaming John", 6000));
        candidates.add(new Candidate("Grace Grace", 2400));
        candidates.add(new Candidate("ROB Robber", 1800));
        candidates.add(new Candidate("Obma Hussein", 3200));
        candidates.add(new Candidate("Hananh Montana", 20000));
        int totalVotes = countVotes(candidates);
        System.out.println("Inital Votes:");
        printTable(candidates, totalVotes);
        System.out.println();
        System.out.println("Replace Grace Grace with Gaming John_2");
        replaceName(candidates, "Grace Grace", "Gaming John_2");
        printTable(candidates, totalVotes);
        System.out.println();
        System.out.println("Replacing Gaming John_2's votes with fradulent ones");
        replaceVotes(candidates, "Gaming John_2", 1_000_000);
        totalVotes = countVotes(candidates);
        printTable(candidates, totalVotes);
        System.out.println();
        System.out.println("Replacing Hananh Montana with wonderful george monkey");
        replaceCandidate(candidates, "Hananh Montana", "Wonderful George Monkey", 1_147_483_647);
        totalVotes = countVotes(candidates);
        printTable(candidates, totalVotes);
        System.out.println();
        System.out.println("Inserting a new candidate at index 3");
        insertCandidate(candidates, 3, "The Rock", 1200);
        totalVotes = countVotes(candidates);
        printTable(candidates, totalVotes);
        System.out.println();
        System.out.println("Inserting a new candidate before ROB Robber");
        insertCandidateBefore(candidates, "ROB Robber", "The Rock_2", 1300);
        totalVotes = countVotes(candidates);
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

    public static void replaceName(ArrayList<Candidate> candidates, String oldName, String newName) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
            }
        }
    }

    public static void replaceVotes(ArrayList<Candidate> candidates, String name, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.setVotes(newVotes);
            }
        }
    }

    public static void replaceCandidate(ArrayList<Candidate> candidates, String oldName, String newName, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
                candidate.setVotes(newVotes);
            }
        }
    }

    public static void insertCandidate(ArrayList<Candidate> candidates, int location, String name, int votes) {
        candidates.add(location, new Candidate(name, votes));
    }

    public static void insertCandidateBefore(ArrayList<Candidate> candidates, String find, String name, int votes) {
        int location = 0;
        for (int i = 0; i < candidates.size(); i++) {
            if (candidates.get(i).getName().equals(find)) {
                location = i;
                break;
            }
        }
        insertCandidate(candidates, location, name, votes);
    }
}
