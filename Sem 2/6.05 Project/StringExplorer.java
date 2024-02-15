/**
 * A program to allow students to try out different
 * String methods.
 *
 * Code adapted from work by Laurie White for the College Board.
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        System.out.println("sample = " + sample);
        System.out.println();

        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println("sample.indexOf(\"quick\") = " + position);

        int notFoundPos  = sample.indexOf("slow");
        System.out.println("sample.indexOf(\"slow\") = " + notFoundPos);

        position = sample.indexOf("o");
        System.out.println("sample.indexOf(\"o\") = "+ position);
        position = sample.indexOf("o", position + 1);
        System.out.println("sample.indexOf(\"o\", position + 1) = " + position);

        System.out.println();

        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println("sample.toLowerCase() = " + lowerCase);
        System.out.println("After toLowerCase(), sample = " + sample);
        System.out.println();

        boolean isEqual = sample.equals(sample.toLowerCase());
        System.out.println("sample.equals(sample.toLowerCase() = "+ isEqual);

        sample = " Hello My name is: Gavin ";
        System.out.println("sample = " + sample);

        sample = sample.trim();
        System.out.println("sample.trim() = " + sample);
    
        int length = sample.length();
        System.out.println("sample.length() = " + length);
    
        int indexOfSpace = sample.indexOf(" ");
        System.out.println("sample.indexOf(\" \") = " + indexOfSpace);
        int indexOfSpaceAfterIndex6 = sample.indexOf(" ", 6);
        System.out.println("sample.indexOf(\" \", 6) = " + indexOfSpaceAfterIndex6);
    
        String sub1 = sample.substring(6);
        System.out.println("sample.substring(6) = " + sub1);
        String sub2 = sample.substring(6, 11);
        System.out.println("sample.substring(6, 11) = " + sub2);
    
        String anotherString = " Hello My name is: George ";
        System.out.println("anotherString = " + anotherString);

        int comparisonResult = sample.compareTo(anotherString);
        System.out.println("sample.compareTo(anotherString) = " + comparisonResult);
    
        boolean containsName = sample.contains("Gavin");
        System.out.println("sample.contains(\"Gavin\") = " + containsName);

        boolean containsHooba = sample.contains("HOOBA");
        System.out.println("sample.contains(\"HOOBA\") = " + containsHooba);
    }

}
