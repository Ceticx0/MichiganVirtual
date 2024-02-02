// Gavin Perry, 8/29/23, The purpose of this program is to illustrate the usage of variables and printing arithmetic expressions
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Declare integer values
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;

        // Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        
        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        
        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println(dNum2 + " * " + dNum3 + " * "+ dNum3 + " = " + (dNum2 * dNum3 * dNum3));

        System.out.println(dNum1 + " * " + dNum3 + " = " + (dNum1 * dNum3));
        
        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        
        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        
        // Additional int equations
        System.out.println("Mixed Integer");
        System.out.println(iNum3 + " + " + iNum1 + " / " + iNum2 + " = " + (iNum3 + iNum1 / iNum2));
        System.out.println(iNum2 + " - " + iNum3 + " % " + iNum2 + " = " + (iNum2 - iNum3 % iNum2));
        System.out.println(iNum3 + " * " + iNum1 + " / " + iNum2 + " = " + (iNum3 * iNum1 / iNum2));
        
        // Additional double equations
        System.out.println("Mixed Double");
        System.out.println(dNum3 + " + " + dNum1 + " / " + dNum2 + " = " + (dNum3 + dNum1 / dNum2));
        System.out.println(dNum2 + " - " + dNum3 + " % " + dNum2 + " = " + (dNum2 - dNum3 % dNum2));
        System.out.println(dNum3 + " * " + dNum1 + " / " + dNum2 + " = " + (dNum3 * dNum1 / dNum2)); 
        
    } // end of main method
} // end of class
