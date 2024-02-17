// Gavin Perry, 2024-2-15, The purpose of this program is to test the Candidate class by traversing through an aray of candidates and performing actions.
public class ElectionTesterV1 {
    public static void main(String[] args) {
        Candidate[] candidates = {new Candidate("Gaming Johnson", 6000), new Candidate("Grace Grace", 2400), new Candidate("ROB Robber", 1800), new Candidate("Obma Hussein", 3200), new Candidate("Hananh Montana", 20000)};
        System.out.println("Raw Results:");
        printVotes(candidates);
        System.out.println();
        int totalVotes = countVotes(candidates);
        printTable(candidates, totalVotes);
        System.out.println("Total votes: " + totalVotes);
    }

    public static void printVotes(Candidate[] candidates) {
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }

    public static int countVotes(Candidate[] candidates) {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            totalVotes += candidate.getVotes();
        }
        return totalVotes;
    }

    public static void printTable(Candidate[] candidates, int totalVotes) {
        System.out.println("Candidate\tVotes\t% of Total");
        System.out.println("==================================");
        for (Candidate candidate : candidates) {
            System.out.printf("%s\t%d\t%.2f%n", candidate.getName(), candidate.getVotes(), ((double)candidate.getVotes() / totalVotes) * 100);
        }
    }
}
