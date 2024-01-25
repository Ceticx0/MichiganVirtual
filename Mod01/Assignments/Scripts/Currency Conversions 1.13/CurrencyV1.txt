/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Gavin Perry (replace with your name)
 * @version 09/21/23       (replace with today's date)
 */
public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars

        double pesosSpent = 7210.25;            // Mexican Pesos spent
        double pesoExchangeRate = 17.12;     // 1 US dollar = 17.12 Pesos

        //remaining variables below here

		double eurosSpent = 1200.89;	// EU Euros spent
		double euroExchangeRate = 0.93;	// 1 USD = 0.93 euro
		
		double bahtSpent = 10800;	// Thai Bahts spent
		double bahtExchangeRate = 36.01;	// 1 USD = 36.01

		// Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        // Conversion
        // code goes below here

        double dollarsSpentInMexico = pesosSpent / pesoExchangeRate;      // US dollars spent in Mexico
        double dollarsAfterMexico = startingUsDollars - dollarsSpentInMexico;        // US dollars remaining after Mexico
		System.out.println("Mexico:");
		System.out.println(" Pesos Spent: " + pesosSpent);
		System.out.println(" US Dollar equivalent: " + dollarsSpentInMexico);
		System.out.println(" US Dollars reminaing: " + dollarsAfterMexico);
		System.out.println();

		double dollarsSpentInItaly = eurosSpent / euroExchangeRate;
		double dollarsAfterItaly = dollarsAfterMexico - dollarsSpentInItaly;
		System.out.println("Italy:");
		System.out.println(" Euros Spent: " + eurosSpent);
		System.out.println(" US Dollar equivalent: " + dollarsSpentInItaly);
		System.out.println(" US Dollars remaining: " + dollarsAfterItaly);
		System.out.println();

		double dollarsSpentInThailand = bahtSpent / bahtExchangeRate;
		double dollarsAfterThailand = dollarsAfterItaly - dollarsSpentInThailand;
		System.out.println("Thailand:");
		System.out.println(" Baht Spent: " + bahtSpent);
		System.out.println(" US Dollar equivalent: " + dollarsSpentInThailand);
		System.out.println(" US Dollars remaining: " + dollarsAfterThailand);
		System.out.println();


        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		//Calculations for Souvenir #1
		int costItem1 = 12;  						//cost per item of first souvenir
		int budget1 = 100;   						//budget for first item
		int totalItems1 = budget1 / costItem1; 		//how many items can be purchased
		int fundsRemaining1 = budget1 % costItem1;  //how much of the budget is left

		System.out.println("Item 1");
		System.out.println("   Cost per item: $" + costItem1 );
		System.out.println("   Budget: $"+ budget1);
		System.out.println("   Total items purchased: " +  totalItems1);
		System.out.println("   Funds remaining: $"  +  fundsRemaining1);
     	System.out.println();
		
		//Calculations for Souvenir #2
		double costItem2 = 29.99;  						//cost per item of second souvenir
		int budget2 = 500;   							//budget for second item
		int totalItems2 = (int)(budget2 / costItem2); 	//how many items can be purchased
		double fundsRemaining2 = budget2 % costItem2;  	//how much of the budget is left

		System.out.println("Item 2");
		System.out.println("   Cost per item: $" + costItem2 );
		System.out.println("   Budget: $"+ budget2);
		System.out.println("   Total items purchased: " +  totalItems2);
		System.out.println("   Funds remaining: $"  +  fundsRemaining2);

    } // end of main method
} // end of class

