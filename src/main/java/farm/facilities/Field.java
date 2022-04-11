package farm.facilities;

import farm.Main;
import farm.animals.Animal;
import farm.facilities.Facility;

public class Field extends Facility {

    public static final String NAME = "field";

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void enterFacility(Animal animal) {
        Main.logger.warn("The animal is enjoying life!");
    }
}