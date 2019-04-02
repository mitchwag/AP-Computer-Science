/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		Card card1 = new Card("king", "red", 2);
		System.out.println(card1.rank());
		System.out.println(card1.suit());
		System.out.println(card1.pointValue());
		System.out.println(card1.toString());
		
		Card card2 = new Card("jack", "black", 6);
		System.out.println(card2.rank());
		System.out.println(card2.suit());
		System.out.println(card2.pointValue());
		System.out.println(card2.toString());
		
		Card card3 = new Card("jack", "black", 6);
		System.out.println(card3.rank());
		System.out.println(card3.suit());
		System.out.println(card3.pointValue());
		System.out.println(card3.toString());
		
		System.out.println("Card 1 matches Card 2: " + card1.matches(card2));
		System.out.println("Card 2 matches Card 3: " + card2.matches(card3));
		System.out.println("Card 3 matches Card 1: " + card3.matches(card1));
	}
}
