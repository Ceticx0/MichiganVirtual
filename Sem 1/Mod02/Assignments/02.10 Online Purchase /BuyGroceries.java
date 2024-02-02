// Gavin Perry, 10/17/23, The purpose of this program is to create and print out a recipt based on parsed user inputs.
import java.util.Scanner;
public class BuyGroceries
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your first and last name? ");
        String firstName = scan.next();
        String lastName = scan.next();
        String firstInital = firstName.substring(0, 1); 

        System.out.print("\nPlease enter todays date (mm/dd/yyyy) ");
        String dateString = scan.next();
        dateString.replace('/', '-');
        System.out.println(dateString);
        scan.nextLine();  // To avoid the next one eating the \n

        System.out.print("\nWhat grocery would you like to buy? ");
        String grocery = scan.nextLine();

        System.out.println("\nHow many would you like to buy? ");
        String quantity = scan.next();

        System.out.print("\nWhat is the price of this item? ");
        String price = scan.next();
        price = price.replace("$", "");
        double priceDouble = Double.parseDouble(price);
        int quantityInt = Integer.parseInt(quantity);
        double total = priceDouble * quantityInt;

        System.out.print("\nPlease enter your debit card number (#####-###-####) ");
        String debit = scan.next();

        System.out.print("\nPlease enter your pin (####) ");
        String pin = scan.next();

        System.out.println("\n\n********************");
        System.out.println("********************");
        System.out.println("E-RECEIPT");
        System.out.println();
        System.out.println(dateString);
        System.out.println("Order Number: APL#43245");
        System.out.println();
        System.out.println("\t" + firstInital + ". " + lastName);
        System.out.println("\tAccount ####-###-" + debit.substring(10, 14));
        System.out.println("\tItem: " + grocery);
        System.out.println("\tPrice per item: " + price);
        System.out.println("\tQuantity: " + quantity);
        System.out.println();
        System.out.println("\t$" + total + " will be debited to your account");
        System.out.println("\tThank you for shopping, please come again.");
        System.out.println();
        System.out.println("********************");
        System.out.println("********************");
    }
}