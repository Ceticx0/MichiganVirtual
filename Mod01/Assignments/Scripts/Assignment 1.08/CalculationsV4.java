
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @ author APCS Team
 * @ version 2020
 */
public class CalculationsV4
{
    public static void main(String[ ] args)
    {
        // Declare integer values
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println("43.21 + 3.14 = " + 43.21 + 3.14);
        //System.out.println();
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println("3.14 - 10.0 = " + (3.14 - 10.0));
        //System.out.println();
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2)); 
        System.out.println("3.14 * 10.0 * 10.0 = " + 3.14 * 10.0 * 10.0);
        //System.out.println();
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println( "43.21 / 10.0 = " + 43.32 / 10);
        //System.out.println();
         
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + iNum3 % iNum2);
        System.out.println("10.0 % 3.14 = " + 10.0 % 3.14);
        //System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("Mixed");
        System.out.println(iNum3 + " + " + iNum1 + " / " + iNum2 + " = " + (iNum3 + iNum1 / iNum2));
        System.out.println(iNum2 + " - " + iNum3 + " % " + iNum2 + " = " + (iNum2 - iNum3 % iNum2));
        System.out.println(iNum3 + " * " + iNum1 + " / " + iNum2 + " = " + (iNum3 * iNum1 / iNum2));
        // 1.09 Additional double Equations
        
               
    } // end of main method
} // end of class
