// Gavin Perry, 11/30/2023, this program generates random passwords at a given length.
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        String userChoice = "Y";
        int minPasswordLen = 8;
        int pwLength = 0;
        int randNum = 0; 
        String password;
        char randChar;
        String input;

	    // initialize scanner and print writer
        Scanner in = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));

        // Ask for password length 
        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");

        while (true) {
            while (true) {
                // the user wants to continue
                System.out.print("Enter a password length (at least 8): ");
                input = in.next();

                // validate password length
                try {
                    pwLength = Integer.parseInt(input);
                } catch (NumberFormatException nfe) {
                    System.out.println("\tPlease Input a number!");
                    continue;
                }

                if (pwLength < minPasswordLen) {
                    System.out.println("\tPassword too short. Please try again.");
                    continue;
                }

                break;
            }

            password = "";
            for(int i=0; i<pwLength; i++) {
                // generate a random character in the correct character set
                // ascii ranges (inclusive): numbers: 48-57, Uppercase: 65-90, lowercase: 97-122 
                // generate until its in the ranges b/c there's symbols between each
                randNum = 0;
                while (!(randNum >= 48 && randNum <= 57) && !(randNum >= 65 && randNum <= 90) && !(randNum >= 97 && randNum <= 122)) { 
                    randNum = 48 + (int)(Math.random() * ((122 - 48) + 1));
                }
                randChar = (char)randNum;
                // concatenate the character to the password
                password += randChar;
            }

            // write the password to the file
            outFile.println(password);
            System.out.println("A password has been added to the text file.");
            System.out.print("Would you like to generate another password? (Y/N): ");
            input = in.next();
            if (input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes")) {
                continue;
            } else {
                break;
            }
        }
        // when the user is done, close the text file so that it can be re-opened and read
        outFile.close();

        // Read passwords back from text file and display to the screen
        Scanner inFile = new Scanner(new File("passwords.txt"));
        int line = 0;

        while (inFile.hasNextLine()) {
            line++;
            password = inFile.nextLine();
            System.out.println(line + ". " + password);
        }
            

  }//end main
}//end class


