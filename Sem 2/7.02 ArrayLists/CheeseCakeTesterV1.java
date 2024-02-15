/**
 * @purpose Test Cheesecake class
 *
 * @author Gavin Perry
 * @version 2024-2-9
 *
 */
import java.util.ArrayList;

public class CheeseCakeTesterV1
{
    public static void main(String[] args)
    {
        //initializing and declareing an ArrayList and adding in objects as elements
        ArrayList<CheeseCakeV1> cake = new ArrayList<CheeseCakeV1>();
        // add CheeseCake to the ArrayList
        cake.add(new CheeseCakeV1("Strawberry", 3));
        cake.add(new CheeseCakeV1("Blueberry", 2));
        cake.add(new CheeseCakeV1("Raspberry", 1));
        cake.add(new CheeseCakeV1("Chocolate", 4));

        //calls several method for each object to perform calculations
        for(CheeseCakeV1 dataRecord : cake)
        {
            dataRecord.calcTotalServings();
            dataRecord.calcCreamCheese();
            dataRecord.calcVanilla();
            dataRecord.calcSugar();
        }
        
        //printing the format of the table
        System.out.println("|       Cheese Cake Data           |             Ingredient Calculations             |");
        System.out.println("| Index | Quantity |  Flavor       | Cream Cheese | Servings |   Sugar   |  Vanilla  |");
        System.out.println("|-------|----------|---------------|--------------|----------|-----------|-----------|");

        CheeseCakeV1 dataRecord;

        //using a for loop to print out the objects' data
        for(int index = 0; index < cake.size(); index ++)
        {
            // print each CheeseCake's data
            System.out.println(String.format("|%7d", index) + cake.get(index));
        }
    }
}
