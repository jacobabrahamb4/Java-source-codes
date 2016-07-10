import java.security.SecureRandom;

public class DeckOfCards {
	public static final String[] FACES = { "Ace", "Deuse", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Jack", "Queen", "King" };
	public static final String[] SUITS = { "Hearts", "Diamonds", "Clubs", "Spades" };
	public static final int NUMBER_OF_CARDS = FACES.length * SUITS.length;

	private Card[] deck;
	private int currentCard;
	private static final SecureRandom randomNumbers = new SecureRandom();

	public DeckOfCards() {
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		int i = 0;
		for (String suit : SUITS) {
			for (String face : FACES) {
				deck[i++] = new Card(face, suit);
			}
		}
	}

	public void shuffle() {
		currentCard = 0;
		int i = 0;
		for (Card card : deck) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			deck[i++] = deck[second];
			deck[second] = card;
		}
	}

	public Card dealCard() {
		if (currentCard < NUMBER_OF_CARDS) {
			return deck[currentCard++];
		} else
			return null;
	}

	public void printDeck() {
		for (Card card : deck) {
			System.out.println("Printing the deck:");
			System.out.println(card.toString());
		}
	}

}
