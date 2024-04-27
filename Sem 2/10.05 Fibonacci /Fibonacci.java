// Gavin Perry, 2024-4-14, The purpose of this program is to allow the user to generate a Fibonacci number at a given position.
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while (n != -1) {
            n = getN(in);
            if (n == -1) {
                break;
            }
            System.out.println("Fibonacci number at position " + n + " is: " + calcFibonacci(n));
        }
    }

    public static int getN(Scanner in) {
        System.out.print("Enter the value of n (-1 to quit): ");
        return in.nextInt();
    }

    public static int calcFibonacci(int n) {
        if (n < 0 || n > 45) {
            System.out.println("n must be within range of 0-45");
            return -1;
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return calcFibonacci(n - 1) + calcFibonacci(n - 2);
    }
}
