import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card fourDiamonds;

    @Before
    public void before(){
     fourDiamonds = new Card(SuitType.DIAMOND,NumberType.FOUR);
    }

    @Test
    public void hasSuit(){
        assertEquals(SuitType.DIAMOND, fourDiamonds.getSuit());
    }

    @Test
    public void hasNumber() {
        assertEquals(NumberType.FOUR, fourDiamonds.getNumber());
    }

        @Test
        public void getRank(){
            assertEquals(1,SuitType.DIAMOND.getRank());
        }
        @Test
        public void getDeck(){
            Deck newDeck = new Deck();
            System.out.println(newDeck);
             assertEquals(52, newDeck.countCards());
        }


    }//class








