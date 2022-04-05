import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CowTest {


    @Test
    public void testCowConstructing() {
        Cow milka = new Cow(2);
        assertEquals(milka.getSex(),'f');
        assertEquals(milka.getAge(), 2);
    }

}