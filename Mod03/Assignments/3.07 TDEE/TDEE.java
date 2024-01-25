// Gavin Perry, 11/3/2023, The purpose of this program is to display a users TDEE given a gender, BMR, and activity level.
import java.util.Scanner;

public class TDEE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double activityFactor = 0;

        // Get inputs
        System.out.println("==== TDEE Calculator ====");
        System.out.println("Please enter your first and last name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your gender (e.g. M or F): ");
        String gender = scan.next();
        System.out.println("Please enter your BMR: ");
        double bmr = scan.nextDouble();

        System.out.println("-- Please enter your activity level's corresponding letter --");
        System.out.println("* Activity Level | Activities *");
        System.out.println("[A] Resting | sleeping, reclining");
        System.out.println("[B] Sedentary | Minimal movement, mainly sitting/lying down (e.g., watching TV, reading, etc.)");
        System.out.println("[C] Light | Office work, sitting (e.g., walking, laundry, walking on level ground at 2.5 – 3.0 mph).");
        System.out.println("[D] Moderate | Light manual labor (e.g., dancing, cycling, gardening, etc.)");
        System.out.println("[E] Very Active | Hard manual labor (e.g., team sports, climbing, agricultural labor, etc.)");
        System.out.println("[F] Extremely Active | Heavy manual labor (e.g., full-time athletes, construction workers, etc.)");
        String activityLevel = scan.next();

        // oh my god horrible mess of if statements because they haven't taught us hashmaps or any other better solutions and want us to use logical operators.
        if (activityLevel.equalsIgnoreCase("A")){
            activityFactor = 1.0;
        } else if(activityLevel.equalsIgnoreCase("B")){
            activityFactor = 1.3;
        } else if(activityLevel.equalsIgnoreCase("C")){
            activityFactor = 1.5;  // Female Version
        } else if(activityLevel.equalsIgnoreCase("D")){
            activityFactor = 1.6;  // Female Version
        } else if(activityLevel.equalsIgnoreCase("E")){
            activityFactor = 1.9;  // Female Version
        } else if(activityLevel.equalsIgnoreCase("F")){
            activityFactor = 2.2;  // Female Version
        } else{
            System.out.println("Invalid activity level choice!");
            System.exit(0);
        }

        // add offsets for male versions just so theirs less if statements in one place. This is really a bad way of doing things.
        if (gender.equalsIgnoreCase("M")) {
            if (activityFactor > 1.3 && activityFactor < 1.9) {
                activityFactor += 0.1;
            } else if (activityFactor > 1.3) {  // either 1.9 or 2.2 now
                activityFactor += 0.2;
            }
        }

        double tdee = activityFactor * bmr;
        System.out.println("==== Results ====");
        System.out.print("Name: " + name);
        System.out.println("\t\tGender: " + gender);
        System.out.print("BMR: " + String.format("%.2f", bmr));
        System.out.println("\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + String.format("%.2f", tdee) + " Calories/Day");
    }   
}
