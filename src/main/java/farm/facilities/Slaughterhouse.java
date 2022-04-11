package farm.facilities;

import farm.animals.Animal;

public class Slaughterhouse extends Facility {

    private static final String NAME = "Slaughterhouse";

    public Slaughterhouse() {
        super();
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public void enterFacility(Animal animal) {
        animal.setAlive(false);
        animal.butch();
    }



}