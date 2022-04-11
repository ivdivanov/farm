
package farm;

import farm.animals.Animal;
import farm.animals.Bull;
import farm.animals.Hen;
import farm.animals.Sow;
import farm.facilities.HenHouse;
import farm.facilities.Pigsty;
import farm.facilities.Shed;
import farm.facilities.Slaughterhouse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;


public class Main {


    public static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("I've got the power");

        Hen henny = new Hen(3);
        Sow prascho = new Sow(3);
        Bull milcho = new Bull(0);
        Farm farm = new Farm();


        Slaughterhouse slaughterhouse = new Slaughterhouse();
        Shed shed = new Shed();
        HenHouse henHouse = new HenHouse();
        Pigsty pigsty = new Pigsty();
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(henny);
        animals.add(prascho);
        for (Animal animal : animals) {
            henHouse.enterFacility(animal);
        }


    }
}