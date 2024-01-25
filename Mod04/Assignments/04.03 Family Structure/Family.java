// Gavin Perry, 11/16/2023, The purpose of this progam is a read a sample of thousands of families' demographics and determine the number and percentage of each type
import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class Family {
    public static void main(String[] args) throws IOException {
        int bb = 0;
        int gb = 0;
        int gg = 0;
        int sampleSize = 0;

        File fileName = new File("familyMembers.txt");
        Scanner inFile = new Scanner(fileName);
        
        while (inFile.hasNextLine()) {
            String family = inFile.nextLine();
            sampleSize++;
            switch (family) {
                case "BB":
                    bb++;
                    break;
                case "GB":
                    gb++;
                    break;
                case "GG":
                    gg++;
                    break;
                default:
                    // most likely blank line, doesn't count
                    sampleSize--;
            }
        }
        System.out.println(sampleSize + " Familes total");
        System.out.printf("%s Families with 2 boys - %.2f%% of sample\n", bb, (double)bb/sampleSize * 100);
        System.out.printf("%s Families with 2 girls - %.2f%% of sample\n", gg, (double)gg/sampleSize * 100);
        System.out.printf("%s Families with 1 boy and 1 girl - %.2f%% of sample\n", gb, (double)gb/sampleSize * 100);
    }
}
