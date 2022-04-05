import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class FarmTest {

    Farm farm = new Farm();
    Farm.Slaughterhouse slaughterhouse = farm.new Slaughterhouse();

    Animal pig = new Boar(3);

    @Test
    public void addingAnimalsToTheFarm() {

        Animal sow = new Sow(3);
        assertEquals(sow.isAlive(),true);
    }

    @Test
    public void removingAnimalsWithButchering() {
        Animal cow = new Cow(3);
        slaughterhouse.entersTheSlaughterHouse(cow);
        assertEquals(cow.isAlive(),false);

    }



}