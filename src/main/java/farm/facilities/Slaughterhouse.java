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

//    public void entersTheSlaughterHouse(Animal animal) {
//        if (animal.isAlive()) {
//            animal.butch();
//            animal.setAlive(false);
//        } else {
//            Main.logger.error("The animal was butchered once already");
//        }
//    }
}
