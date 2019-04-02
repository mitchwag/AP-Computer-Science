/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
        Deck deck1 = new Deck(new String[]{"King", "8", "9"}, new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}, new int[]{10, 8, 9});
        Deck deck2 = new Deck(new String[]{"Ace", "3", "5", "Queen"}, new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}, new int[]{11, 3, 5, 10});
        Deck deck3 = new Deck(new String[]{}, new String[]{"Hearts", "Diamonds", "Clubs", "Spades"}, new int[]{});
        
        System.out.println("Deck 1: " + deck1);
        System.out.println("Deck 2: " + deck2);
        System.out.println("Deck 3: " + deck3);
        
        System.out.println("Deck 1 Empty: " + deck1.isEmpty());
        System.out.println("Deck 3 Empty: " + deck2.isEmpty());
        System.out.println("Deck 3 Empty: " + deck3.isEmpty());
        
        System.out.println("Deck 1 Size: " + deck1.size());
        System.out.println("Deck 2 Size: " + deck2.size());
        System.out.println("Deck 3 Size: " + deck3.size());
        
        System.out.println("Deck 1 Deal: " + deck1.deal());
        System.out.println("Deck 2 Deal: " + deck2.deal());
        System.out.println("Deck 3 Deal: " + deck3.deal());
	}
}
