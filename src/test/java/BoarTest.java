import farm.animals.Boar;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BoarTest {

    @Test
    public void testHenConstructing() {
        Boar gligan = new Boar(2);
        assertEquals(gligan.getSex(),'m');
        assertEquals(gligan.getAge(), 2);
        assertTrue(gligan.isAlive());
    }

}