// Gavin Perry, 2024-4-26, The purpose of this program is to define a collection of cards as a deck and make methods associated with them.
import java.util.List;
import java.util.ArrayList;

public class Deck
{
   private List<Card> cards; 
   private int size;

   public Deck(String[] ranks, String[] suits, int[] values)
   {
      cards = new ArrayList<Card>(); // initialize cards as a new ArrayList

      // loop through the parameter arrays to add new cards
      for (String suit : suits) {
         for (int i = 0; i < ranks.length; i++) {
            Card card = new Card(ranks[i], suit, values[i]);
            cards.add(card);
         }
      }

      size = cards.size();

      shuffle();
   }

   public boolean isEmpty()
   {
      return size == 0;
   }

   public int size()
   {
      return size;
   }

   public void shuffle()
   {
      return;
   }

   public Card deal()
   {
      if (isEmpty()) {
         return null;
      } else {
         size--;
         return cards.get(size);
      }
   }

   @Override
   public String toString()
   {
      String rtn = "size = " + size + "\nUndealt cards: \n";

      for (int k = size - 1; k >= 0; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != 0)
         {
            rtn = rtn + ", ";
         }
         if ((size - k) % 2 == 0)
         {
            rtn = rtn + "\n";
         }
      }

      rtn = rtn + "\nDealt cards: \n";
      for (int k = cards.size() - 1; k >= size; k--)
      {
         rtn = rtn + cards.get(k);
         if (k != size)
         {
            rtn = rtn + ", ";
         }
         if ((k - cards.size()) % 2 == 0)
         {
            rtn = rtn + "\n";
         }
      }
      rtn = rtn + "\n";
      return rtn;
   }
}
