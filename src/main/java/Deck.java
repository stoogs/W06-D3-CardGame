    import java.util.ArrayList;
    import java.util.Collections;

    public class Deck {
    private  ArrayList<Card> cards;  //cards is an array of cards

    public Deck(){
        this.cards = makeNewDeck(); // deck created
        shuffleDeck(); // deck shuffled
    }

    public int countCards(){
        return this.cards.size();
    }

    public static ArrayList<Card> makeNewDeck() {
        ArrayList<Card> deck = new ArrayList<>();  //create new deck, albeit an empty one.

        SuitType[] allSuits = SuitType.values(); //create array of all suit types
        NumberType[] allNumbers = NumberType.values(); //create array of all numbers

        for (NumberType number : allNumbers) {  //
            for (SuitType suit : allSuits) {
                Card newCard = new Card(suit, number);
                deck.add(newCard);
            }
        }
        return deck;
    }
        public void shuffleDeck(){
            Collections.shuffle(this.cards);
        }
    } //class
