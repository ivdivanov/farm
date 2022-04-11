package farm;

import farm.animals.Animal;
import farm.animals.Boar;
import farm.animals.Cow;
import farm.animals.Sow;
import farm.facilities.Slaughterhouse;
import farm.Farm;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FarmTest {

    Farm farm = new Farm();
    Slaughterhouse slaughterhouse = new Slaughterhouse();
    Animal pig = new Boar(3);

    @Test
    public void addingAnimalsToTheFarm() {

        Animal sow = new Sow(3);
        assertEquals(sow.isAlive(),true);
    }

    @Test
    public void removingAnimalsWithButchering() {
        Animal cow = new Cow(3);
        slaughterhouse.enterFacility(cow);
        assertFalse(cow.isAlive());
    }
}