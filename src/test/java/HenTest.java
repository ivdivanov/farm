import farm.animals.Hen;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HenTest {

    @Test
    public void testHenConstructing() {
        Hen pile = new Hen(2);
        assertEquals(pile.getSex(),'f');
        assertEquals(pile.getAge(), 2);
        assertTrue(pile.isAlive());
    }

}