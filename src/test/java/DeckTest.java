import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {
    Deck testDeck;

    @Before
    public void before(){
        testDeck = new Deck();
    }

    @Test
    public void sizeOfDeck(){
        assertEquals(52,testDeck.countCards());
    }
    @Test
    public void objectClass(){  //messing around
        assertEquals(this.getClass(),testDeck.getClass());
    }
}//class
