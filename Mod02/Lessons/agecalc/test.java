import java.util.Scanner;

public record test() {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String userAge = in.next();
    String a = "\t /t"
    Integer ageInYears = Integer.parseInt(userAge);
    double approxAgeInDays = ageInYears * 365.25;
    }
}
