// Gavin Perry, 2024-2-16, The purpose of this program is to test the Candidate class by traversing through an aray of candidates and performing actions on them.
public class ElectionTesterV7 {
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
        System.out.println();
        System.out.println("Deleting Gaming John_2 for fraud charges");
        deleteCandidate(candidates, "Gaming John_2");
        totalVotes = countVotes(candidates);
        printTable(candidates, totalVotes);
        System.out.println();
        System.out.println("Deleting index 0 for funsies");
        deleteCandidate(candidates, 0);
        totalVotes = countVotes(candidates);
        printTable(candidates, totalVotes);
        System.out.println("Total votes: " + totalVotes);
    }

    public static void printVotes(Candidate[] candidates) {
        for (Candidate candidate : candidates) {
            if (candidate != null) {
                System.out.println(candidate);
            }
        }
    }

    public static int countVotes(Candidate[] candidates) {
        int totalVotes = 0;
        for (Candidate candidate : candidates) {
            if (candidate != null) {
                totalVotes += candidate.getVotes();
            }
        }
        return totalVotes;
    }

    public static void printTable(Candidate[] candidates, int totalVotes) {
        System.out.println("Candidate\tVotes\t% of Total");
        System.out.println("==================================");
        for (Candidate candidate : candidates) {
            if (candidate != null) {
                System.out.printf("%s\t%d\t%.2f%n", candidate.getName(), candidate.getVotes(), ((double)candidate.getVotes() / totalVotes) * 100);
            }
        }
    }

    public static void replaceName(Candidate[] candidates, String oldName, String newName) {
        for (Candidate candidate : candidates) {
            if (candidate != null && candidate.getName().equals(oldName)) {
                candidate.setName(newName);
            }
        }
    }

    public static void replaceVotes(Candidate[] candidates, String name, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate != null && candidate.getName().equals(name)) {
                candidate.setVotes(newVotes);
            }
        }
    }

    public static void replaceCandidate(Candidate[] candidates, String oldName, String newName, int newVotes) {
        for (Candidate candidate : candidates) {
            if (candidate != null && candidate.getName().equals(oldName)) {
                candidate.setName(newName);
                candidate.setVotes(newVotes);
            }
        }
    }

    public static void insertCandidate(Candidate[] candidates, int location, String name, int votes) {
        for (int i = candidates.length - 1; i > location; i--) {
            candidates[i] = candidates[i - 1];
        }
        candidates[location] = new Candidate(name, votes);
    }

    public static void insertCandidateBefore(Candidate[] candidates, String find, String name, int votes) {
        int location = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] != null && candidates[i].getName().equals(find)) {
                location = i;
                break;
            }
        }
        insertCandidate(candidates, location, name, votes);
    }

    public static void deleteCandidate(Candidate[] candidates, int location) {
        for (int i = location; i < candidates.length - 1; i++) {
            candidates[i] = candidates[i + 1];
        }
        candidates[candidates.length - 1] = null;
    }

    public static void deleteCandidate(Candidate[] candidates, String name) {
        int location = 0;
        for (int i = 0; i < candidates.length; i++) {
            if (candidates[i] != null && candidates[i].getName().equals(name)) {
                location = i;
                break;
            }
        }
        deleteCandidate(candidates, location);
    }
}
