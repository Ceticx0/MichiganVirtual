// Gavin Perry, 11/3/23, The Purpose of this program is to display a BMI given an input of height and weight, after performing the nessesary conversions.
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Get inputs
        System.out.println("==== BMI Calculator ====");
        System.out.println("Please enter your first and last name: ");
        String name = scan.nextLine();
        System.out.println("Please enter your height (e.g. 5 9): ");
        int heightFeet = scan.nextInt();
        int heightInches = scan.nextInt();
        System.out.println("Pleas enter your weight in pounds: ");
        int weightLbs = scan.nextInt();
        // Calculations
        int fullHeightIn = (heightFeet * 12) + heightInches;
        double weightKg = weightLbs * 0.4535924;
        double heightM = fullHeightIn * 0.0254;
        double bmi = (weightKg) / (Math.pow(heightM, 2));
        String weightStatus;
        if (bmi < 18.5) {
            weightStatus = "Underweight";
        } else if (18.5 <= bmi && bmi < 25) {
            weightStatus = "Normal or Healthy Weight";
        } else if (25 <= bmi && bmi < 30) {
            weightStatus = "Overweight";
        } else {
            weightStatus = "Obese";
        }

        // Display results
        System.out.println("==== Results ====");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + ((int)(heightM * 100))/100.0);
        System.out.println("Weight (kg): " + ((int)(weightKg * 100))/100.0);
        System.out.println("BMI: " + ((int)(bmi * 100))/100.0);
        System.out.println("Category: " + weightStatus);

        scan.close();
    }
}
