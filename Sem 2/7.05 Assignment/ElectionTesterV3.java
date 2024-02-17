// Gavin Perry, 2024-2-15, The purpose of this program is to test the Candidate class by traversing through an aray of candidates and performing actions on them.
public class ElectionTesterV3 {
    public static void main(String[] args) {
        Candidate[] candidates = {new Candidate("Gaming John", 6000), new Candidate("Grace Grace", 2400), new Candidate("ROB Robber", 1800), new Candidate("Obma Hussein", 3200), new Candidate("Hananh Montana", 20000)};
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

    public static void replaceName(Candidate[] candidates, String oldName, String newName) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
            }
        }
    }

    public static void replaceVotes(Candidate[] candidates, String name, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(name)) {
                candidate.setVotes(newVotes);
            }
        }
    }

    public static void replaceCandidate(Candidate[] candidates, String oldName, String newName, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate.getName().equals(oldName)) {
                candidate.setName(newName);
                candidate.setVotes(newVotes);
            }
        }
    }
}
