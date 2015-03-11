/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {
  
  /**
   * The main method in this class checks the Deck operations for consistency.
   * @param args is not used.
   */
  public static void main(String[] args) {
    String[] ranks =new String[3];
    String [] suits=new String[3];
    int [] values = new int [3];
    ranks[0] = "Ace";
    ranks[1] = "Queen";
    ranks[2] = "King";
    suits[0] = "Diamonds";
    suits[1] = "Hearts";
    suits[2] = "Clubs";
    values[0] = 1;
    values[1] = 12;
    values[2] = 13;
    Deck d1 = new Deck(ranks, suits, value);
    Deck d2 = new Deck(ranks, suits, value);
    Deck d3 = new Deck(ranks, suits, values);
    System.out.println(d3.isEmpty());
    
    
  }
}
