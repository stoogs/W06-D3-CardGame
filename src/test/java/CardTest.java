import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card testCard;

    @Before
    public void before(){
     testCard = new Card(SuitType.DIAMOND,NumberType.FOUR);
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.DIAMOND, testCard.getSuit());
    }

    @Test
    public void hasNumber() {
        assertEquals(NumberType.FOUR, testCard.getNumber());
    }

        @Test
        public void getRank(){
            assertEquals(1,SuitType.DIAMOND.getRank());
        }
        @Test
        public void getDeck(){
            Deck newDeck = new Deck();
//           newDeck.shuffleDeck();
            System.out.println(newDeck);
             assertEquals(52, newDeck.countCards());
        }

    }//class








