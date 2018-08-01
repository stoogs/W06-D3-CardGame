import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player dave;

    @Before
    public void before() {
        dave = new Player("Dave");
    }

    @Test
    public void playerExists() {
        assertEquals("Dave", dave.getName());
    }
}//class
