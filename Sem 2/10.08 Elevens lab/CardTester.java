/**
 * This is a class that tests the Card class.
 *
 *  Gavin Perry
 *  2024-4-26
 */

public class CardTester
{
   /**
    * The main method in this class checks the Card operations for consistency.
    * @param args is not used.
    */
   public static void main(String[] args) {

      Card aceHearts = new Card("ace", "hearts", 1);
      Card kingSpades = new Card("king", "spades", 10);
      Card fiveDiamonds = new Card("five", "diamonds", 5);

      // Test card 1 and methods
      System.out.println("**** Tests Card 1: ace of hearts ****");
      System.out.println("  rank: " + aceHearts.rank());
      System.out.println("  suit: " + aceHearts.suit());
      System.out.println("  pointValue: " + aceHearts.pointValue());
      System.out.println("  toString: " + aceHearts.toString());
      System.out.println();

      // Test card 2 and methods
      System.out.println("**** Tests Card 2: king of spades ****");
      System.out.println("  rank: " + kingSpades.rank());
      System.out.println("  suit: " + kingSpades.suit());
      System.out.println("  pointValue: " + kingSpades.pointValue());
      System.out.println("  toString: " + kingSpades.toString());
      System.out.println();

      // Test card 3 and methods
      System.out.println("**** Tests Card 3: five of diamonds ****");
      System.out.println("  rank: " + fiveDiamonds.rank());
      System.out.println("  suit: " + fiveDiamonds.suit());
      System.out.println("  pointValue: " + fiveDiamonds.pointValue());
      System.out.println("  toString: " + fiveDiamonds.toString());
      System.out.println();

      // Test matches() method
      System.out.println("**** Testing matches() method ****");
      System.out.println("Matching aceHearts and kingSpades: " + aceHearts.matches(kingSpades));
      System.out.println("Matching kingSpades and kingSpades: " + kingSpades.matches(kingSpades));
      System.out.println("Matching kingSpades and fiveDiamonds: " + kingSpades.matches(fiveDiamonds));
   }
}
