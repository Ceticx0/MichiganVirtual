// Gavin Perry, 2024-4-2, The purpose of this program is to test the Caesar Shift Cipher using encryption and decryption classes and static methods.
import java.util.Scanner;

public class CaesarTester {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int shift = -1;
        String text = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        while (shift < 0 || shift > 25) {
            shift = getShift(in);
        }
        System.out.println("Original Alphabet: " + text);
        System.out.println("Alphabet with shift of: " + shift + " " + Encryption.getCipherAlphabet(shift)); 

        int mode = getMode(in);
        while (mode != 0) {
            text = getText(in);
            System.out.println("Original text: " + text);
            if (mode == 1) {
                System.out.println("Encryped text: " + Encryption.encrypt(text, shift));
            } else {
                System.out.println("Decrypted text: " + Decryption.decrypt(text, shift));
            }
            mode = getMode(in);
        }
    }

    private static int getShift(Scanner in) {
        System.out.println("Enter a shift key 0-25: ");
        return in.nextInt();
    }

    private static int getMode(Scanner in) {
        System.out.println("Please Select a mode: ");
        System.out.println("0. Quit");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.print(": ");
        int choice = in.nextInt();
        if (choice > 2 || choice < 0) {
            System.out.println("Please enter a valid number");
            return getMode(in);
        }
        return choice;
    }

    public static String getText(Scanner in) {
        System.out.println("Please enter the text to encrypt/decrypt: ");
        in.nextLine();
        String text = in.nextLine();
        return text;
    } 
}
