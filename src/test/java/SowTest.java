import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SowTest {


    @Test
    public void testSowConstructing() {
        Sow prase = new Sow(2);
        assertEquals(prase.getSex(),'f');
        assertEquals(prase.getAge(), 2);
        assertTrue(prase.isAlive());
    }


}