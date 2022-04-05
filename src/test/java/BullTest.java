import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BullTest {

    @Test
    public void testHenConstructing() {
        Bull bik = new Bull(2);
        assertEquals(bik.getSex(),'m');
        assertEquals(bik.getAge(), 2);
        assertTrue(bik.isAlive);
    }

}