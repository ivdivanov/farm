import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;


public class Main {


    static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        logger.info("I've got the power");

        Hen henny = new Hen(3);
        Sow prascho = new Sow(3);
        Bull milcho = new Bull(0);
        Farm farm = new Farm();


        Farm.Slaughterhouse slaughterhouse = farm.new Slaughterhouse();
        Farm.Shed shed = farm.new Shed();
        Farm.HenHouse henHouse = farm.new HenHouse();
        Farm.Pigsty pigsty = farm.new Pigsty();


        pigsty.entersThePigsty(prascho);
        slaughterhouse.entersTheSlaughterHouse(henny);
        slaughterhouse.entersTheSlaughterHouse(prascho);
        slaughterhouse.entersTheSlaughterHouse(milcho);
        pigsty.entersThePigsty(prascho);


    }
}
