// Gavin Perry, 2024-4-2, The purpose of this program is to calculate the number of prime numbers between a given range.
import java.util.Scanner;

public class PrimeCalculator {
    int lowerLimit;
    int upperLimit;

    public PrimeCalculator(int lowerLimit, int upperLimit) {
        // use this so that the variables are not shadowed
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    public void displayPrimes() {
        int primeCount = 0;
        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are:");
        // Iterate through all numbers and check if they are prime.
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isPrime(i)) {
                primeCount++;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Total prime numbers between " + lowerLimit + " and " + upperLimit + " are: " + primeCount);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // get lower and upper limits
        System.out.print("Enter Lower limit: ");
        int lower = in.nextInt();
        System.out.print("Enter Upper limit: ");
        int upper = in.nextInt();

        PrimeCalculator primeCalculator = new PrimeCalculator(lower, upper);
        primeCalculator.displayPrimes();
    }

    // Function to check if a number is prime or not
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
