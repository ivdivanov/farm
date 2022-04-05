import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RoosterTest {

    @Test
    public void testHenConstructing() {
        Rooster pile = new Rooster(2);
        assertEquals(pile.getSex(),'m');
        assertEquals(pile.getAge(), 2);
        assertTrue(pile.isAlive);
    }

}